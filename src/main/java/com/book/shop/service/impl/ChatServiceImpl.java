package com.book.shop.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.book.shop.dao.ChatDao;
import com.book.shop.entity.ChatEntity;
import com.book.shop.entity.view.ChatView;
import com.book.shop.entity.vo.ChatVO;
import com.book.shop.service.ChatService;
import com.book.shop.utils.PageUtils;
import com.book.shop.utils.Query;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service("chatService")
public class ChatServiceImpl extends ServiceImpl<ChatDao, ChatEntity> implements ChatService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChatEntity> page = this.selectPage(
                new Query<ChatEntity>(params).getPage(),
                new EntityWrapper<ChatEntity>()
        );
        return new PageUtils(page);
    }

    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChatEntity> wrapper) {
		  Page<ChatView> page =new Query<ChatView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    @Override
	public List<ChatVO> selectListVO(Wrapper<ChatEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}

	@Override
	public ChatVO selectVO(Wrapper<ChatEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}

	@Override
	public List<ChatView> selectListView(Wrapper<ChatEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChatView selectView(Wrapper<ChatEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
