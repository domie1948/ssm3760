package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 宠物寄养
 *
 * @author 
 * @email
 * @date 2021-04-26
 */
@TableName("chongwu_jiyang")
public class ChongwuJiyangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChongwuJiyangEntity() {

	}

	public ChongwuJiyangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 宠物名称
     */
    @TableField(value = "chongwu_jiyang_name")

    private String chongwuJiyangName;


    /**
     * 宠物类别
     */
    @TableField(value = "chongwu_types")

    private Integer chongwuTypes;


    /**
     * 性别
     */
    @TableField(value = "chongwu_sex_types")

    private Integer chongwuSexTypes;


    /**
     * 年龄
     */
    @TableField(value = "chongwu_jiyang_age")

    private String chongwuJiyangAge;


    /**
     * 花色
     */
    @TableField(value = "chongwu_jiyang_huase")

    private String chongwuJiyangHuase;


    /**
     * 健康情况
     */
    @TableField(value = "chongwu_jiankang_types")

    private Integer chongwuJiankangTypes;


    /**
     * 所在地
     */
    @TableField(value = "chongwu_jiyang_suozaidi")

    private String chongwuJiyangSuozaidi;


    /**
     * 宠物照片
     */
    @TableField(value = "chongwu_jiyang_photo")

    private String chongwuJiyangPhoto;


    /**
     * 宠物详情
     */
    @TableField(value = "chongwu_jiyang_content")

    private String chongwuJiyangContent;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "yuyue_time",fill = FieldFill.UPDATE)

    private Date yuyueTime;


    /**
     * 寄养天数
     */
    @TableField(value = "chongwu_jiyang_number")

    private Integer chongwuJiyangNumber;


    /**
     * 是否接收
     */
    @TableField(value = "chongwu_jiyang_types")

    private Integer chongwuJiyangTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：宠物名称
	 */
    public String getChongwuJiyangName() {
        return chongwuJiyangName;
    }


    /**
	 * 获取：宠物名称
	 */

    public void setChongwuJiyangName(String chongwuJiyangName) {
        this.chongwuJiyangName = chongwuJiyangName;
    }
    /**
	 * 设置：宠物类别
	 */
    public Integer getChongwuTypes() {
        return chongwuTypes;
    }


    /**
	 * 获取：宠物类别
	 */

    public void setChongwuTypes(Integer chongwuTypes) {
        this.chongwuTypes = chongwuTypes;
    }
    /**
	 * 设置：性别
	 */
    public Integer getChongwuSexTypes() {
        return chongwuSexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setChongwuSexTypes(Integer chongwuSexTypes) {
        this.chongwuSexTypes = chongwuSexTypes;
    }
    /**
	 * 设置：年龄
	 */
    public String getChongwuJiyangAge() {
        return chongwuJiyangAge;
    }


    /**
	 * 获取：年龄
	 */

    public void setChongwuJiyangAge(String chongwuJiyangAge) {
        this.chongwuJiyangAge = chongwuJiyangAge;
    }
    /**
	 * 设置：花色
	 */
    public String getChongwuJiyangHuase() {
        return chongwuJiyangHuase;
    }


    /**
	 * 获取：花色
	 */

    public void setChongwuJiyangHuase(String chongwuJiyangHuase) {
        this.chongwuJiyangHuase = chongwuJiyangHuase;
    }
    /**
	 * 设置：健康情况
	 */
    public Integer getChongwuJiankangTypes() {
        return chongwuJiankangTypes;
    }


    /**
	 * 获取：健康情况
	 */

    public void setChongwuJiankangTypes(Integer chongwuJiankangTypes) {
        this.chongwuJiankangTypes = chongwuJiankangTypes;
    }
    /**
	 * 设置：所在地
	 */
    public String getChongwuJiyangSuozaidi() {
        return chongwuJiyangSuozaidi;
    }


    /**
	 * 获取：所在地
	 */

    public void setChongwuJiyangSuozaidi(String chongwuJiyangSuozaidi) {
        this.chongwuJiyangSuozaidi = chongwuJiyangSuozaidi;
    }
    /**
	 * 设置：宠物照片
	 */
    public String getChongwuJiyangPhoto() {
        return chongwuJiyangPhoto;
    }


    /**
	 * 获取：宠物照片
	 */

    public void setChongwuJiyangPhoto(String chongwuJiyangPhoto) {
        this.chongwuJiyangPhoto = chongwuJiyangPhoto;
    }
    /**
	 * 设置：宠物详情
	 */
    public String getChongwuJiyangContent() {
        return chongwuJiyangContent;
    }


    /**
	 * 获取：宠物详情
	 */

    public void setChongwuJiyangContent(String chongwuJiyangContent) {
        this.chongwuJiyangContent = chongwuJiyangContent;
    }
    /**
	 * 设置：预约时间
	 */
    public Date getYuyueTime() {
        return yuyueTime;
    }


    /**
	 * 获取：预约时间
	 */

    public void setYuyueTime(Date yuyueTime) {
        this.yuyueTime = yuyueTime;
    }
    /**
	 * 设置：寄养天数
	 */
    public Integer getChongwuJiyangNumber() {
        return chongwuJiyangNumber;
    }


    /**
	 * 获取：寄养天数
	 */

    public void setChongwuJiyangNumber(Integer chongwuJiyangNumber) {
        this.chongwuJiyangNumber = chongwuJiyangNumber;
    }
    /**
	 * 设置：是否接收
	 */
    public Integer getChongwuJiyangTypes() {
        return chongwuJiyangTypes;
    }


    /**
	 * 获取：是否接收
	 */

    public void setChongwuJiyangTypes(Integer chongwuJiyangTypes) {
        this.chongwuJiyangTypes = chongwuJiyangTypes;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "ChongwuJiyang{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", chongwuJiyangName=" + chongwuJiyangName +
            ", chongwuTypes=" + chongwuTypes +
            ", chongwuSexTypes=" + chongwuSexTypes +
            ", chongwuJiyangAge=" + chongwuJiyangAge +
            ", chongwuJiyangHuase=" + chongwuJiyangHuase +
            ", chongwuJiankangTypes=" + chongwuJiankangTypes +
            ", chongwuJiyangSuozaidi=" + chongwuJiyangSuozaidi +
            ", chongwuJiyangPhoto=" + chongwuJiyangPhoto +
            ", chongwuJiyangContent=" + chongwuJiyangContent +
            ", yuyueTime=" + yuyueTime +
            ", chongwuJiyangNumber=" + chongwuJiyangNumber +
            ", chongwuJiyangTypes=" + chongwuJiyangTypes +
            ", createTime=" + createTime +
        "}";
    }
}
