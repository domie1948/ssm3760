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
 * 志愿者
 *
 * @author 
 * @email
 * @date 2021-04-26
 */
@TableName("zhiyuanzhe")
public class ZhiyuanzheEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhiyuanzheEntity() {

	}

	public ZhiyuanzheEntity(T t) {
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
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 姓名
     */
    @TableField(value = "zhiyuanzhe_name")

    private String zhiyuanzheName;


    /**
     * 性别
     */
    @TableField(value = "zhiyuanzhe_sex_types")

    private Integer zhiyuanzheSexTypes;


    /**
     * 年龄
     */
    @TableField(value = "zhiyuanzhe_age")

    private Integer zhiyuanzheAge;


    /**
     * 照片
     */
    @TableField(value = "zhiyuanzhe_photo")

    private String zhiyuanzhePhoto;


    /**
     * 工作
     */
    @TableField(value = "zhiyuanzhe_gongzuo")

    private String zhiyuanzheGongzuo;


    /**
     * 收入
     */
    @TableField(value = "zhiyuanzhe_jine")

    private Integer zhiyuanzheJine;


    /**
     * 家庭地址
     */
    @TableField(value = "zhiyuanzhe_address")

    private String zhiyuanzheAddress;


    /**
     * 联系方式
     */
    @TableField(value = "zhiyuanzhe_phone")

    private String zhiyuanzhePhone;


    /**
     * 身份证号
     */
    @TableField(value = "zhiyuanzhe_id_number")

    private String zhiyuanzheIdNumber;


    /**
     * 爱好
     */
    @TableField(value = "zhiyuanzhe_aihao")

    private String zhiyuanzheAihao;


    /**
     * 是否养过宠物
     */
    @TableField(value = "zhiyuanzhe_yesno_types")

    private Integer zhiyuanzheYesnoTypes;


    /**
     * 是否启用
     */
    @TableField(value = "zhiyuanzhe_types")

    private Integer zhiyuanzheTypes;


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
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：姓名
	 */
    public String getZhiyuanzheName() {
        return zhiyuanzheName;
    }


    /**
	 * 获取：姓名
	 */

    public void setZhiyuanzheName(String zhiyuanzheName) {
        this.zhiyuanzheName = zhiyuanzheName;
    }
    /**
	 * 设置：性别
	 */
    public Integer getZhiyuanzheSexTypes() {
        return zhiyuanzheSexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setZhiyuanzheSexTypes(Integer zhiyuanzheSexTypes) {
        this.zhiyuanzheSexTypes = zhiyuanzheSexTypes;
    }
    /**
	 * 设置：年龄
	 */
    public Integer getZhiyuanzheAge() {
        return zhiyuanzheAge;
    }


    /**
	 * 获取：年龄
	 */

    public void setZhiyuanzheAge(Integer zhiyuanzheAge) {
        this.zhiyuanzheAge = zhiyuanzheAge;
    }
    /**
	 * 设置：照片
	 */
    public String getZhiyuanzhePhoto() {
        return zhiyuanzhePhoto;
    }


    /**
	 * 获取：照片
	 */

    public void setZhiyuanzhePhoto(String zhiyuanzhePhoto) {
        this.zhiyuanzhePhoto = zhiyuanzhePhoto;
    }
    /**
	 * 设置：工作
	 */
    public String getZhiyuanzheGongzuo() {
        return zhiyuanzheGongzuo;
    }


    /**
	 * 获取：工作
	 */

    public void setZhiyuanzheGongzuo(String zhiyuanzheGongzuo) {
        this.zhiyuanzheGongzuo = zhiyuanzheGongzuo;
    }
    /**
	 * 设置：收入
	 */
    public Integer getZhiyuanzheJine() {
        return zhiyuanzheJine;
    }


    /**
	 * 获取：收入
	 */

    public void setZhiyuanzheJine(Integer zhiyuanzheJine) {
        this.zhiyuanzheJine = zhiyuanzheJine;
    }
    /**
	 * 设置：家庭地址
	 */
    public String getZhiyuanzheAddress() {
        return zhiyuanzheAddress;
    }


    /**
	 * 获取：家庭地址
	 */

    public void setZhiyuanzheAddress(String zhiyuanzheAddress) {
        this.zhiyuanzheAddress = zhiyuanzheAddress;
    }
    /**
	 * 设置：联系方式
	 */
    public String getZhiyuanzhePhone() {
        return zhiyuanzhePhone;
    }


    /**
	 * 获取：联系方式
	 */

    public void setZhiyuanzhePhone(String zhiyuanzhePhone) {
        this.zhiyuanzhePhone = zhiyuanzhePhone;
    }
    /**
	 * 设置：身份证号
	 */
    public String getZhiyuanzheIdNumber() {
        return zhiyuanzheIdNumber;
    }


    /**
	 * 获取：身份证号
	 */

    public void setZhiyuanzheIdNumber(String zhiyuanzheIdNumber) {
        this.zhiyuanzheIdNumber = zhiyuanzheIdNumber;
    }
    /**
	 * 设置：爱好
	 */
    public String getZhiyuanzheAihao() {
        return zhiyuanzheAihao;
    }


    /**
	 * 获取：爱好
	 */

    public void setZhiyuanzheAihao(String zhiyuanzheAihao) {
        this.zhiyuanzheAihao = zhiyuanzheAihao;
    }
    /**
	 * 设置：是否养过宠物
	 */
    public Integer getZhiyuanzheYesnoTypes() {
        return zhiyuanzheYesnoTypes;
    }


    /**
	 * 获取：是否养过宠物
	 */

    public void setZhiyuanzheYesnoTypes(Integer zhiyuanzheYesnoTypes) {
        this.zhiyuanzheYesnoTypes = zhiyuanzheYesnoTypes;
    }
    /**
	 * 设置：是否启用
	 */
    public Integer getZhiyuanzheTypes() {
        return zhiyuanzheTypes;
    }


    /**
	 * 获取：是否启用
	 */

    public void setZhiyuanzheTypes(Integer zhiyuanzheTypes) {
        this.zhiyuanzheTypes = zhiyuanzheTypes;
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
        return "Zhiyuanzhe{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", zhiyuanzheName=" + zhiyuanzheName +
            ", zhiyuanzheSexTypes=" + zhiyuanzheSexTypes +
            ", zhiyuanzheAge=" + zhiyuanzheAge +
            ", zhiyuanzhePhoto=" + zhiyuanzhePhoto +
            ", zhiyuanzheGongzuo=" + zhiyuanzheGongzuo +
            ", zhiyuanzheJine=" + zhiyuanzheJine +
            ", zhiyuanzheAddress=" + zhiyuanzheAddress +
            ", zhiyuanzhePhone=" + zhiyuanzhePhone +
            ", zhiyuanzheIdNumber=" + zhiyuanzheIdNumber +
            ", zhiyuanzheAihao=" + zhiyuanzheAihao +
            ", zhiyuanzheYesnoTypes=" + zhiyuanzheYesnoTypes +
            ", zhiyuanzheTypes=" + zhiyuanzheTypes +
            ", createTime=" + createTime +
        "}";
    }
}
