package com.book.shop.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.book.shop.entity.ShangpinxinxiEntity;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.BeanUtils;


/**
 * 商品信息
 * 后端返回视图实体辅助类
 */
@TableName("shangpinxinxi")
public class ShangpinxinxiView  extends ShangpinxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangpinxinxiView(){
	}

 	public ShangpinxinxiView(ShangpinxinxiEntity shangpinxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, shangpinxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
