package com.book.shop.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.book.shop.dao.DiscussshangpinxinxiDao;
import com.book.shop.entity.DiscussshangpinxinxiEntity;
import com.book.shop.entity.view.DiscussshangpinxinxiView;
import com.book.shop.entity.vo.DiscussshangpinxinxiVO;
import com.book.shop.service.DiscussshangpinxinxiService;
import com.book.shop.utils.PageUtils;
import com.book.shop.utils.Query;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service("discussshangpinxinxiService")
public class DiscussshangpinxinxiServiceImpl extends ServiceImpl<DiscussshangpinxinxiDao, DiscussshangpinxinxiEntity> implements DiscussshangpinxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshangpinxinxiEntity> page = this.selectPage(
                new Query<DiscussshangpinxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussshangpinxinxiEntity>()
        );
        return new PageUtils(page);
    }

    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshangpinxinxiEntity> wrapper) {
		  Page<DiscussshangpinxinxiView> page =new Query<DiscussshangpinxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    @Override
	public List<DiscussshangpinxinxiVO> selectListVO(Wrapper<DiscussshangpinxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}

	@Override
	public DiscussshangpinxinxiVO selectVO(Wrapper<DiscussshangpinxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}

	@Override
	public List<DiscussshangpinxinxiView> selectListView(Wrapper<DiscussshangpinxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshangpinxinxiView selectView(Wrapper<DiscussshangpinxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
