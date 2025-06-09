package com.entity.view;

import com.entity.ChongwuHuifangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 宠物回访
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-26
 */
@TableName("chongwu_huifang")
public class ChongwuHuifangView extends ChongwuHuifangEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 chongwu_order
			/**
			* 宠物
			*/
			private Integer chongwuId;
			/**
			* 用户
			*/
			private Integer yonghuId;
			/**
			* 现在所在地址
			*/
			private String xianzaiAddress;
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			/**
			* 试养时间
			*/
			private Date shiyangTime;
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			/**
			* 创建时间
			*/
			private Date insertTime;

	public ChongwuHuifangView() {

	}

	public ChongwuHuifangView(ChongwuHuifangEntity chongwuHuifangEntity) {
		try {
			BeanUtils.copyProperties(this, chongwuHuifangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

















				//级联表的get和set chongwu_order
					/**
					* 获取： 宠物
					*/
					public Integer getChongwuId() {
						return chongwuId;
					}
					/**
					* 设置： 宠物
					*/
					public void setChongwuId(Integer chongwuId) {
						this.chongwuId = chongwuId;
					}
					/**
					* 获取： 用户
					*/
					public Integer getYonghuId() {
						return yonghuId;
					}
					/**
					* 设置： 用户
					*/
					public void setYonghuId(Integer yonghuId) {
						this.yonghuId = yonghuId;
					}
					/**
					* 获取： 现在所在地址
					*/
					public String getXianzaiAddress() {
						return xianzaiAddress;
					}
					/**
					* 设置： 现在所在地址
					*/
					public void setXianzaiAddress(String xianzaiAddress) {
						this.xianzaiAddress = xianzaiAddress;
					}
					/**
					* 获取： 试养时间
					*/
					public Date getShiyangTime() {
						return shiyangTime;
					}
					/**
					* 设置： 试养时间
					*/
					public void setShiyangTime(Date shiyangTime) {
						this.shiyangTime = shiyangTime;
					}
					/**
					* 获取： 创建时间
					*/
					public Date getInsertTime() {
						return insertTime;
					}
					/**
					* 设置： 创建时间
					*/
					public void setInsertTime(Date insertTime) {
						this.insertTime = insertTime;
					}










}
