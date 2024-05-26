package com.book.shop.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.book.shop.entity.ChatEntity;
import com.book.shop.entity.view.ChatView;
import com.book.shop.entity.vo.ChatVO;
import java.util.List;
import org.apache.ibatis.annotations.Param;


/**
 * 在线客服
 */
public interface ChatDao extends BaseMapper<ChatEntity> {

	List<ChatVO> selectListVO(@Param("ew") Wrapper<ChatEntity> wrapper);

	ChatVO selectVO(@Param("ew") Wrapper<ChatEntity> wrapper);

	List<ChatView> selectListView(@Param("ew") Wrapper<ChatEntity> wrapper);

	List<ChatView> selectListView(Pagination page,@Param("ew") Wrapper<ChatEntity> wrapper);

	ChatView selectView(@Param("ew") Wrapper<ChatEntity> wrapper);


}
