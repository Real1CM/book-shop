package com.book.shop.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.book.shop.entity.AddressEntity;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.BeanUtils;


/**
 * 地址
 * 后端返回视图实体辅助类
 */
@TableName("address")
public class AddressView  extends AddressEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public AddressView(){
	}

 	public AddressView(AddressEntity addressEntity){
 	try {
			BeanUtils.copyProperties(this, addressEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
