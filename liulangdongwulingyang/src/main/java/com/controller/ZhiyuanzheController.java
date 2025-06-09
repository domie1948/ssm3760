package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.ZhiyuanzheEntity;

import com.service.ZhiyuanzheService;
import com.entity.view.ZhiyuanzheView;

import com.utils.PageUtils;
import com.utils.R;

/**
 * 志愿者
 * 后端接口
 * @author
 * @email
 * @date 2021-04-26
*/
@RestController
@Controller
@RequestMapping("/zhiyuanzhe")
public class ZhiyuanzheController {
    private static final Logger logger = LoggerFactory.getLogger(ZhiyuanzheController.class);

    @Autowired
    private ZhiyuanzheService zhiyuanzheService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
     
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        params.put("orderBy","id");
        PageUtils page = zhiyuanzheService.queryPage(params);

        //字典表数据转换
        List<ZhiyuanzheView> list =(List<ZhiyuanzheView>)page.getList();
        for(ZhiyuanzheView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ZhiyuanzheEntity zhiyuanzhe = zhiyuanzheService.selectById(id);
        if(zhiyuanzhe !=null){
            //entity转view
            ZhiyuanzheView view = new ZhiyuanzheView();
            BeanUtils.copyProperties( zhiyuanzhe , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ZhiyuanzheEntity zhiyuanzhe, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,zhiyuanzhe:{}",this.getClass().getName(),zhiyuanzhe.toString());
        Wrapper<ZhiyuanzheEntity> queryWrapper = new EntityWrapper<ZhiyuanzheEntity>()
            .eq("username", zhiyuanzhe.getUsername())
            .or()
            .eq("zhiyuanzhe_phone", zhiyuanzhe.getZhiyuanzhePhone())
            .or()
            .eq("zhiyuanzhe_id_number", zhiyuanzhe.getZhiyuanzheIdNumber());
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZhiyuanzheEntity zhiyuanzheEntity = zhiyuanzheService.selectOne(queryWrapper);
        if(zhiyuanzheEntity==null){
            zhiyuanzhe.setCreateTime(new Date());
            zhiyuanzhe.setPassword("123456");
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      zhiyuanzhe.set
        //  }
            zhiyuanzheService.insert(zhiyuanzhe);
            return R.ok();
        }else {
            return R.error(511,"账户或者身份证号或者手机号已经被使用");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ZhiyuanzheEntity zhiyuanzhe, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,zhiyuanzhe:{}",this.getClass().getName(),zhiyuanzhe.toString());
        //根据字段查询是否有相同数据
        Wrapper<ZhiyuanzheEntity> queryWrapper = new EntityWrapper<ZhiyuanzheEntity>()
            .notIn("id",zhiyuanzhe.getId())
            .andNew()
            .eq("username", zhiyuanzhe.getUsername())
            .or()
            .eq("zhiyuanzhe_phone", zhiyuanzhe.getZhiyuanzhePhone())
            .or()
            .eq("zhiyuanzhe_id_number", zhiyuanzhe.getZhiyuanzheIdNumber());
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZhiyuanzheEntity zhiyuanzheEntity = zhiyuanzheService.selectOne(queryWrapper);
        if("".equals(zhiyuanzhe.getZhiyuanzhePhoto()) || "null".equals(zhiyuanzhe.getZhiyuanzhePhoto())){
                zhiyuanzhe.setZhiyuanzhePhoto(null);
        }
        if(zhiyuanzheEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      zhiyuanzhe.set
            //  }
            zhiyuanzheService.updateById(zhiyuanzhe);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"账户或者身份证号或者手机号已经被使用");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        zhiyuanzheService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }

    /**
    * 登录
    */
    @IgnoreAuth
    @RequestMapping(value = "/login")
    public R login(String username, String password, String captcha, HttpServletRequest request) {
        ZhiyuanzheEntity zhiyuanzhe = zhiyuanzheService.selectOne(new EntityWrapper<ZhiyuanzheEntity>().eq("username", username));
        if(zhiyuanzhe==null || !zhiyuanzhe.getPassword().equals(password)) {
            return R.error("账号或密码不正确");
        }
        if(zhiyuanzhe.getZhiyuanzheTypes() ==2){
            return R.error("您的账户未被激活");
        }
        //  // 获取监听器中的字典表
        // ServletContext servletContext = ContextLoader.getCurrentWebApplicationContext().getServletContext();
        // Map<String, Map<Integer, String>> dictionaryMap= (Map<String, Map<Integer, String>>) servletContext.getAttribute("dictionaryMap");
        // Map<Integer, String> role_types = dictionaryMap.get("role_types");
        // role_types.get(yonghu.getRoleTypes());
        String token = tokenService.generateToken(zhiyuanzhe.getId(),username, "zhiyuanzhe", "志愿者");
        R r = R.ok();
        r.put("token", token);
        r.put("role","志愿者");
        r.put("username",zhiyuanzhe.getZhiyuanzheName());
        r.put("tableName","zhiyuanzhe");
        r.put("userId",zhiyuanzhe.getId());
        return r;
    }

    /**
    * 注册
    */
    @IgnoreAuth
    @PostMapping(value = "/register")
    public R register(@RequestBody ZhiyuanzheEntity zhiyuanzhe){
    //    	ValidatorUtils.validateEntity(user);
        if(zhiyuanzheService.selectOne(new EntityWrapper<ZhiyuanzheEntity>().eq("username", zhiyuanzhe.getUsername()).orNew().eq("zhiyuanzhe_phone",zhiyuanzhe.getZhiyuanzhePhone()).orNew().eq("zhiyuanzhe_id_number",zhiyuanzhe.getZhiyuanzheIdNumber())) !=null) {
            return R.error("账户已存在或手机号或身份证号已经被使用");
        }
        zhiyuanzhe.setZhiyuanzheTypes(2);
        zhiyuanzhe.setCreateTime(new Date());
        zhiyuanzheService.insert(zhiyuanzhe);
        return R.ok();
    }

    /**
     * 重置密码
     */
    @GetMapping(value = "/resetPassword")
    public R resetPassword(Integer  id){
        ZhiyuanzheEntity zhiyuanzhe = new ZhiyuanzheEntity();
        zhiyuanzhe.setPassword("123456");
        zhiyuanzhe.setId(id);
        zhiyuanzheService.updateById(zhiyuanzhe);
        return R.ok();
    }

    /**
    * 获取用户的session用户信息
    */
    @RequestMapping("/session")
    public R getCurrZhiyuanzhe(HttpServletRequest request){
        Integer id = (Integer)request.getSession().getAttribute("userId");
        ZhiyuanzheEntity zhiyuanzhe = zhiyuanzheService.selectById(id);
        return R.ok().put("data", zhiyuanzhe);
    }


    /**
    * 退出
    */
    @GetMapping(value = "logout")
    public R logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return R.ok("退出成功");
    }



    /**
    * 前端列表
    */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = zhiyuanzheService.queryPage(params);

        //字典表数据转换
        List<ZhiyuanzheView> list =(List<ZhiyuanzheView>)page.getList();
        for(ZhiyuanzheView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ZhiyuanzheEntity zhiyuanzhe = zhiyuanzheService.selectById(id);
            if(zhiyuanzhe !=null){
                //entity转view
        ZhiyuanzheView view = new ZhiyuanzheView();
                BeanUtils.copyProperties( zhiyuanzhe , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody ZhiyuanzheEntity zhiyuanzhe, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,zhiyuanzhe:{}",this.getClass().getName(),zhiyuanzhe.toString());
        Wrapper<ZhiyuanzheEntity> queryWrapper = new EntityWrapper<ZhiyuanzheEntity>()
            .eq("username", zhiyuanzhe.getUsername())
            .or()
            .eq("zhiyuanzhe_phone", zhiyuanzhe.getZhiyuanzhePhone())
            .or()
            .eq("zhiyuanzhe_id_number", zhiyuanzhe.getZhiyuanzheIdNumber());
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
    ZhiyuanzheEntity zhiyuanzheEntity = zhiyuanzheService.selectOne(queryWrapper);
        if(zhiyuanzheEntity==null){
            zhiyuanzhe.setCreateTime(new Date());
        zhiyuanzhe.setPassword("123456");
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      zhiyuanzhe.set
        //  }
        zhiyuanzheService.insert(zhiyuanzhe);
            return R.ok();
        }else {
            return R.error(511,"账户或者身份证号或者手机号已经被使用");
        }
    }





}

