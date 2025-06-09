package com.entity.view;

import com.entity.ZhiyuanzheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 志愿者
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-26
 */
@TableName("zhiyuanzhe")
public class ZhiyuanzheView extends ZhiyuanzheEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 性别的值
		*/
		private String zhiyuanzheSexValue;
		/**
		* 是否养过宠物的值
		*/
		private String zhiyuanzheYesnoValue;
		/**
		* 是否启用的值
		*/
		private String zhiyuanzheValue;



	public ZhiyuanzheView() {

	}

	public ZhiyuanzheView(ZhiyuanzheEntity zhiyuanzheEntity) {
		try {
			BeanUtils.copyProperties(this, zhiyuanzheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 性别的值
			*/
			public String getZhiyuanzheSexValue() {
				return zhiyuanzheSexValue;
			}
			/**
			* 设置： 性别的值
			*/
			public void setZhiyuanzheSexValue(String zhiyuanzheSexValue) {
				this.zhiyuanzheSexValue = zhiyuanzheSexValue;
			}
			/**
			* 获取： 是否养过宠物的值
			*/
			public String getZhiyuanzheYesnoValue() {
				return zhiyuanzheYesnoValue;
			}
			/**
			* 设置： 是否养过宠物的值
			*/
			public void setZhiyuanzheYesnoValue(String zhiyuanzheYesnoValue) {
				this.zhiyuanzheYesnoValue = zhiyuanzheYesnoValue;
			}
			/**
			* 获取： 是否启用的值
			*/
			public String getZhiyuanzheValue() {
				return zhiyuanzheValue;
			}
			/**
			* 设置： 是否启用的值
			*/
			public void setZhiyuanzheValue(String zhiyuanzheValue) {
				this.zhiyuanzheValue = zhiyuanzheValue;
			}













}
