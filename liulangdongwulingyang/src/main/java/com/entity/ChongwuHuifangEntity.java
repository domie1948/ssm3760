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
 * 宠物回访
 *
 * @author 
 * @email
 * @date 2021-04-26
 */
@TableName("chongwu_huifang")
public class ChongwuHuifangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChongwuHuifangEntity() {

	}

	public ChongwuHuifangEntity(T t) {
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
     * 宠物领养订单
     */
    @TableField(value = "chongwu_order_id")

    private Integer chongwuOrderId;


    /**
     * 回访时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "huifang_time",fill = FieldFill.UPDATE)

    private Date huifangTime;


    /**
     * 回访详情
     */
    @TableField(value = "chongwu_huifang_content")

    private String chongwuHuifangContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 设置：宠物领养订单
	 */
    public Integer getChongwuOrderId() {
        return chongwuOrderId;
    }


    /**
	 * 获取：宠物领养订单
	 */

    public void setChongwuOrderId(Integer chongwuOrderId) {
        this.chongwuOrderId = chongwuOrderId;
    }
    /**
	 * 设置：回访时间
	 */
    public Date getHuifangTime() {
        return huifangTime;
    }


    /**
	 * 获取：回访时间
	 */

    public void setHuifangTime(Date huifangTime) {
        this.huifangTime = huifangTime;
    }
    /**
	 * 设置：回访详情
	 */
    public String getChongwuHuifangContent() {
        return chongwuHuifangContent;
    }


    /**
	 * 获取：回访详情
	 */

    public void setChongwuHuifangContent(String chongwuHuifangContent) {
        this.chongwuHuifangContent = chongwuHuifangContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
        return "ChongwuHuifang{" +
            "id=" + id +
            ", chongwuOrderId=" + chongwuOrderId +
            ", huifangTime=" + huifangTime +
            ", chongwuHuifangContent=" + chongwuHuifangContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
