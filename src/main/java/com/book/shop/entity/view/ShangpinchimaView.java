package com.book.shop.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.book.shop.entity.ShangpinchimaEntity;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.BeanUtils;


/**
 * 商品来源
 * 后端返回视图实体辅助类
 */
@TableName("shangpinchima")
public class ShangpinchimaView  extends ShangpinchimaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangpinchimaView(){
	}

 	public ShangpinchimaView(ShangpinchimaEntity shangpinchimaEntity){
 	try {
			BeanUtils.copyProperties(this, shangpinchimaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
