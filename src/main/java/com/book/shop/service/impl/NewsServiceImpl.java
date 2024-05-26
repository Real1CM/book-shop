package com.book.shop.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.book.shop.dao.NewsDao;
import com.book.shop.entity.NewsEntity;
import com.book.shop.entity.view.NewsView;
import com.book.shop.entity.vo.NewsVO;
import com.book.shop.service.NewsService;
import com.book.shop.utils.PageUtils;
import com.book.shop.utils.Query;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service("newsService")
public class NewsServiceImpl extends ServiceImpl<NewsDao, NewsEntity> implements NewsService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NewsEntity> page = this.selectPage(
                new Query<NewsEntity>(params).getPage(),
                new EntityWrapper<NewsEntity>()
        );
        return new PageUtils(page);
    }

    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NewsEntity> wrapper) {
		  Page<NewsView> page =new Query<NewsView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    @Override
	public List<NewsVO> selectListVO(Wrapper<NewsEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}

	@Override
	public NewsVO selectVO(Wrapper<NewsEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}

	@Override
	public List<NewsView> selectListView(Wrapper<NewsEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NewsView selectView(Wrapper<NewsEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
