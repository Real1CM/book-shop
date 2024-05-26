package com.book.shop.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.book.shop.entity.NewsEntity;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.BeanUtils;


/**
 * 商品资讯
 * 后端返回视图实体辅助类
 */
@TableName("news")
public class NewsView  extends NewsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NewsView(){
	}

 	public NewsView(NewsEntity newsEntity){
 	try {
			BeanUtils.copyProperties(this, newsEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
