package com.book.shop.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * 商品来源
 * 数据库通用操作实体类（普通增删改查）
 */
@TableName("shangpinchima")
public class ShangpinchimaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShangpinchimaEntity() {

	}

	public ShangpinchimaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 来源
	 */

	private String chima;


	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：来源
	 */
	public void setChima(String chima) {
		this.chima = chima;
	}
	/**
	 * 获取：来源
	 */
	public String getChima() {
		return chima;
	}

}
