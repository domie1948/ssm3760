package com.entity.model;

import com.entity.ChongwuJiyangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 宠物寄养
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-26
 */
public class ChongwuJiyangModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 宠物名称
     */
    private String chongwuJiyangName;


    /**
     * 宠物类别
     */
    private Integer chongwuTypes;


    /**
     * 性别
     */
    private Integer chongwuSexTypes;


    /**
     * 年龄
     */
    private String chongwuJiyangAge;


    /**
     * 花色
     */
    private String chongwuJiyangHuase;


    /**
     * 健康情况
     */
    private Integer chongwuJiankangTypes;


    /**
     * 所在地
     */
    private String chongwuJiyangSuozaidi;


    /**
     * 宠物照片
     */
    private String chongwuJiyangPhoto;


    /**
     * 宠物详情
     */
    private String chongwuJiyangContent;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date yuyueTime;


    /**
     * 寄养天数
     */
    private Integer chongwuJiyangNumber;


    /**
     * 是否接收
     */
    private Integer chongwuJiyangTypes;


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
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：宠物名称
	 */
    public String getChongwuJiyangName() {
        return chongwuJiyangName;
    }


    /**
	 * 设置：宠物名称
	 */
    public void setChongwuJiyangName(String chongwuJiyangName) {
        this.chongwuJiyangName = chongwuJiyangName;
    }
    /**
	 * 获取：宠物类别
	 */
    public Integer getChongwuTypes() {
        return chongwuTypes;
    }


    /**
	 * 设置：宠物类别
	 */
    public void setChongwuTypes(Integer chongwuTypes) {
        this.chongwuTypes = chongwuTypes;
    }
    /**
	 * 获取：性别
	 */
    public Integer getChongwuSexTypes() {
        return chongwuSexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setChongwuSexTypes(Integer chongwuSexTypes) {
        this.chongwuSexTypes = chongwuSexTypes;
    }
    /**
	 * 获取：年龄
	 */
    public String getChongwuJiyangAge() {
        return chongwuJiyangAge;
    }


    /**
	 * 设置：年龄
	 */
    public void setChongwuJiyangAge(String chongwuJiyangAge) {
        this.chongwuJiyangAge = chongwuJiyangAge;
    }
    /**
	 * 获取：花色
	 */
    public String getChongwuJiyangHuase() {
        return chongwuJiyangHuase;
    }


    /**
	 * 设置：花色
	 */
    public void setChongwuJiyangHuase(String chongwuJiyangHuase) {
        this.chongwuJiyangHuase = chongwuJiyangHuase;
    }
    /**
	 * 获取：健康情况
	 */
    public Integer getChongwuJiankangTypes() {
        return chongwuJiankangTypes;
    }


    /**
	 * 设置：健康情况
	 */
    public void setChongwuJiankangTypes(Integer chongwuJiankangTypes) {
        this.chongwuJiankangTypes = chongwuJiankangTypes;
    }
    /**
	 * 获取：所在地
	 */
    public String getChongwuJiyangSuozaidi() {
        return chongwuJiyangSuozaidi;
    }


    /**
	 * 设置：所在地
	 */
    public void setChongwuJiyangSuozaidi(String chongwuJiyangSuozaidi) {
        this.chongwuJiyangSuozaidi = chongwuJiyangSuozaidi;
    }
    /**
	 * 获取：宠物照片
	 */
    public String getChongwuJiyangPhoto() {
        return chongwuJiyangPhoto;
    }


    /**
	 * 设置：宠物照片
	 */
    public void setChongwuJiyangPhoto(String chongwuJiyangPhoto) {
        this.chongwuJiyangPhoto = chongwuJiyangPhoto;
    }
    /**
	 * 获取：宠物详情
	 */
    public String getChongwuJiyangContent() {
        return chongwuJiyangContent;
    }


    /**
	 * 设置：宠物详情
	 */
    public void setChongwuJiyangContent(String chongwuJiyangContent) {
        this.chongwuJiyangContent = chongwuJiyangContent;
    }
    /**
	 * 获取：预约时间
	 */
    public Date getYuyueTime() {
        return yuyueTime;
    }


    /**
	 * 设置：预约时间
	 */
    public void setYuyueTime(Date yuyueTime) {
        this.yuyueTime = yuyueTime;
    }
    /**
	 * 获取：寄养天数
	 */
    public Integer getChongwuJiyangNumber() {
        return chongwuJiyangNumber;
    }


    /**
	 * 设置：寄养天数
	 */
    public void setChongwuJiyangNumber(Integer chongwuJiyangNumber) {
        this.chongwuJiyangNumber = chongwuJiyangNumber;
    }
    /**
	 * 获取：是否接收
	 */
    public Integer getChongwuJiyangTypes() {
        return chongwuJiyangTypes;
    }


    /**
	 * 设置：是否接收
	 */
    public void setChongwuJiyangTypes(Integer chongwuJiyangTypes) {
        this.chongwuJiyangTypes = chongwuJiyangTypes;
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
