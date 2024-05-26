package com.book.shop.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.book.shop.entity.ChatEntity;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.BeanUtils;


/**
 * 在线客服
 * 后端返回视图实体辅助类
 */
@TableName("chat")
public class ChatView  extends ChatEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChatView(){
	}

 	public ChatView(ChatEntity chatEntity){
 	try {
			BeanUtils.copyProperties(this, chatEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
