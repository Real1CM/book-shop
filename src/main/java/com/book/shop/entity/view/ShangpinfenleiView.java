package com.book.shop.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.book.shop.entity.ShangpinfenleiEntity;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.BeanUtils;


/**
 * 商品分类
 * 后端返回视图实体辅助类
 */
@TableName("shangpinfenlei")
public class ShangpinfenleiView  extends ShangpinfenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangpinfenleiView(){
	}

 	public ShangpinfenleiView(ShangpinfenleiEntity shangpinfenleiEntity){
 	try {
			BeanUtils.copyProperties(this, shangpinfenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
