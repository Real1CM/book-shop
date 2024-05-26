package com.book.shop.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.book.shop.entity.OrdersEntity;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.BeanUtils;


/**
 * 订单
 * 后端返回视图实体辅助类
 */
@TableName("orders")
public class OrdersView  extends OrdersEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public OrdersView(){
	}

 	public OrdersView(OrdersEntity ordersEntity){
 	try {
			BeanUtils.copyProperties(this, ordersEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
