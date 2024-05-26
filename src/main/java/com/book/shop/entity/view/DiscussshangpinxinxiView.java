package com.book.shop.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.book.shop.entity.DiscussshangpinxinxiEntity;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.BeanUtils;


/**
 * 商品信息评论表
 * 后端返回视图实体辅助类
 */
@TableName("discussshangpinxinxi")
public class DiscussshangpinxinxiView  extends DiscussshangpinxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussshangpinxinxiView(){
	}

 	public DiscussshangpinxinxiView(DiscussshangpinxinxiEntity discussshangpinxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussshangpinxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
