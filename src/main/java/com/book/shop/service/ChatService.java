package com.book.shop.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.book.shop.entity.ChatEntity;
import com.book.shop.entity.view.ChatView;
import com.book.shop.entity.vo.ChatVO;
import com.book.shop.utils.PageUtils;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;


/**
 * 在线客服
 */
public interface ChatService extends IService<ChatEntity> {

    PageUtils queryPage(Map<String, Object> params);

   	List<ChatVO> selectListVO(Wrapper<ChatEntity> wrapper);

   	ChatVO selectVO(@Param("ew") Wrapper<ChatEntity> wrapper);

   	List<ChatView> selectListView(Wrapper<ChatEntity> wrapper);

   	ChatView selectView(@Param("ew") Wrapper<ChatEntity> wrapper);

   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChatEntity> wrapper);


}

