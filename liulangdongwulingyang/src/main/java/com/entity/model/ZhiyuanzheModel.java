package com.entity.model;

import com.entity.ZhiyuanzheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 志愿者
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-26
 */
public class ZhiyuanzheModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 姓名
     */
    private String zhiyuanzheName;


    /**
     * 性别
     */
    private Integer zhiyuanzheSexTypes;


    /**
     * 年龄
     */
    private Integer zhiyuanzheAge;


    /**
     * 照片
     */
    private String zhiyuanzhePhoto;


    /**
     * 工作
     */
    private String zhiyuanzheGongzuo;


    /**
     * 收入
     */
    private Integer zhiyuanzheJine;


    /**
     * 家庭地址
     */
    private String zhiyuanzheAddress;


    /**
     * 联系方式
     */
    private String zhiyuanzhePhone;


    /**
     * 身份证号
     */
    private String zhiyuanzheIdNumber;


    /**
     * 爱好
     */
    private String zhiyuanzheAihao;


    /**
     * 是否养过宠物
     */
    private Integer zhiyuanzheYesnoTypes;


    /**
     * 是否启用
     */
    private Integer zhiyuanzheTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：姓名
	 */
    public String getZhiyuanzheName() {
        return zhiyuanzheName;
    }


    /**
	 * 设置：姓名
	 */
    public void setZhiyuanzheName(String zhiyuanzheName) {
        this.zhiyuanzheName = zhiyuanzheName;
    }
    /**
	 * 获取：性别
	 */
    public Integer getZhiyuanzheSexTypes() {
        return zhiyuanzheSexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setZhiyuanzheSexTypes(Integer zhiyuanzheSexTypes) {
        this.zhiyuanzheSexTypes = zhiyuanzheSexTypes;
    }
    /**
	 * 获取：年龄
	 */
    public Integer getZhiyuanzheAge() {
        return zhiyuanzheAge;
    }


    /**
	 * 设置：年龄
	 */
    public void setZhiyuanzheAge(Integer zhiyuanzheAge) {
        this.zhiyuanzheAge = zhiyuanzheAge;
    }
    /**
	 * 获取：照片
	 */
    public String getZhiyuanzhePhoto() {
        return zhiyuanzhePhoto;
    }


    /**
	 * 设置：照片
	 */
    public void setZhiyuanzhePhoto(String zhiyuanzhePhoto) {
        this.zhiyuanzhePhoto = zhiyuanzhePhoto;
    }
    /**
	 * 获取：工作
	 */
    public String getZhiyuanzheGongzuo() {
        return zhiyuanzheGongzuo;
    }


    /**
	 * 设置：工作
	 */
    public void setZhiyuanzheGongzuo(String zhiyuanzheGongzuo) {
        this.zhiyuanzheGongzuo = zhiyuanzheGongzuo;
    }
    /**
	 * 获取：收入
	 */
    public Integer getZhiyuanzheJine() {
        return zhiyuanzheJine;
    }


    /**
	 * 设置：收入
	 */
    public void setZhiyuanzheJine(Integer zhiyuanzheJine) {
        this.zhiyuanzheJine = zhiyuanzheJine;
    }
    /**
	 * 获取：家庭地址
	 */
    public String getZhiyuanzheAddress() {
        return zhiyuanzheAddress;
    }


    /**
	 * 设置：家庭地址
	 */
    public void setZhiyuanzheAddress(String zhiyuanzheAddress) {
        this.zhiyuanzheAddress = zhiyuanzheAddress;
    }
    /**
	 * 获取：联系方式
	 */
    public String getZhiyuanzhePhone() {
        return zhiyuanzhePhone;
    }


    /**
	 * 设置：联系方式
	 */
    public void setZhiyuanzhePhone(String zhiyuanzhePhone) {
        this.zhiyuanzhePhone = zhiyuanzhePhone;
    }
    /**
	 * 获取：身份证号
	 */
    public String getZhiyuanzheIdNumber() {
        return zhiyuanzheIdNumber;
    }


    /**
	 * 设置：身份证号
	 */
    public void setZhiyuanzheIdNumber(String zhiyuanzheIdNumber) {
        this.zhiyuanzheIdNumber = zhiyuanzheIdNumber;
    }
    /**
	 * 获取：爱好
	 */
    public String getZhiyuanzheAihao() {
        return zhiyuanzheAihao;
    }


    /**
	 * 设置：爱好
	 */
    public void setZhiyuanzheAihao(String zhiyuanzheAihao) {
        this.zhiyuanzheAihao = zhiyuanzheAihao;
    }
    /**
	 * 获取：是否养过宠物
	 */
    public Integer getZhiyuanzheYesnoTypes() {
        return zhiyuanzheYesnoTypes;
    }


    /**
	 * 设置：是否养过宠物
	 */
    public void setZhiyuanzheYesnoTypes(Integer zhiyuanzheYesnoTypes) {
        this.zhiyuanzheYesnoTypes = zhiyuanzheYesnoTypes;
    }
    /**
	 * 获取：是否启用
	 */
    public Integer getZhiyuanzheTypes() {
        return zhiyuanzheTypes;
    }


    /**
	 * 设置：是否启用
	 */
    public void setZhiyuanzheTypes(Integer zhiyuanzheTypes) {
        this.zhiyuanzheTypes = zhiyuanzheTypes;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
