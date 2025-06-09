package com.entity.model;

import com.entity.ChongwuHuifangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 宠物回访
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-26
 */
public class ChongwuHuifangModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 宠物领养订单
     */
    private Integer chongwuOrderId;


    /**
     * 回访时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date huifangTime;


    /**
     * 回访详情
     */
    private String chongwuHuifangContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3
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
	 * 获取：宠物领养订单
	 */
    public Integer getChongwuOrderId() {
        return chongwuOrderId;
    }


    /**
	 * 设置：宠物领养订单
	 */
    public void setChongwuOrderId(Integer chongwuOrderId) {
        this.chongwuOrderId = chongwuOrderId;
    }
    /**
	 * 获取：回访时间
	 */
    public Date getHuifangTime() {
        return huifangTime;
    }


    /**
	 * 设置：回访时间
	 */
    public void setHuifangTime(Date huifangTime) {
        this.huifangTime = huifangTime;
    }
    /**
	 * 获取：回访详情
	 */
    public String getChongwuHuifangContent() {
        return chongwuHuifangContent;
    }


    /**
	 * 设置：回访详情
	 */
    public void setChongwuHuifangContent(String chongwuHuifangContent) {
        this.chongwuHuifangContent = chongwuHuifangContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
