package com.book.shop.entity.model;

import java.io.Serializable;


/**
 * 用户
 * 接收传参的实体类
 */
public class YonghuModel  implements Serializable {
	private static final long serialVersionUID = 1L;


	/**
	 * 密码
	 */

	private String mima;

	/**
	 * 姓名
	 */

	private String xingming;

	/**
	 * 头像
	 */

	private String touxiang;

	/**
	 * 性别
	 */

	private String xingbie;

	/**
	 * 手机
	 */

	private String shouji;

	/**
	 * 余额
	 */

	private Float money;


	/**
	 * 设置：密码
	 */

	public void setMima(String mima) {
		this.mima = mima;
	}

	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}


	/**
	 * 设置：姓名
	 */

	public void setXingming(String xingming) {
		this.xingming = xingming;
	}

	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}


	/**
	 * 设置：头像
	 */

	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}

	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}


	/**
	 * 设置：性别
	 */

	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}

	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}


	/**
	 * 设置：手机
	 */

	public void setShouji(String shouji) {
		this.shouji = shouji;
	}

	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}


	/**
	 * 设置：余额
	 */

	public void setMoney(Float money) {
		this.money = money;
	}

	/**
	 * 获取：余额
	 */
	public Float getMoney() {
		return money;
	}

}
