package com.book.shop.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.book.shop.entity.YonghuEntity;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.BeanUtils;


/**
 * 用户
 * 后端返回视图实体辅助类
 */
@TableName("yonghu")
public class YonghuView  extends YonghuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YonghuView(){
	}

 	public YonghuView(YonghuEntity yonghuEntity){
 	try {
			BeanUtils.copyProperties(this, yonghuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
