package com.book.shop.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.book.shop.entity.CartEntity;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.BeanUtils;


/**
 * 购物车表
 * 后端返回视图实体辅助类
 */
@TableName("cart")
public class CartView  extends CartEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CartView(){
	}

 	public CartView(CartEntity cartEntity){
 	try {
			BeanUtils.copyProperties(this, cartEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
