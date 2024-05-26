package com.book.shop.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.book.shop.entity.StoreupEntity;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.BeanUtils;


/**
 * 收藏表
 * 后端返回视图实体辅助类
 */
@TableName("storeup")
public class StoreupView  extends StoreupEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public StoreupView(){
	}

 	public StoreupView(StoreupEntity storeupEntity){
 	try {
			BeanUtils.copyProperties(this, storeupEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
