package com.book.shop.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.book.shop.dao.ShangpinxinxiDao;
import com.book.shop.entity.ShangpinxinxiEntity;
import com.book.shop.entity.view.ShangpinxinxiView;
import com.book.shop.entity.vo.ShangpinxinxiVO;
import com.book.shop.service.ShangpinxinxiService;
import com.book.shop.utils.PageUtils;
import com.book.shop.utils.Query;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service("shangpinxinxiService")
public class ShangpinxinxiServiceImpl extends ServiceImpl<ShangpinxinxiDao, ShangpinxinxiEntity> implements ShangpinxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangpinxinxiEntity> page = this.selectPage(
                new Query<ShangpinxinxiEntity>(params).getPage(),
                new EntityWrapper<ShangpinxinxiEntity>()
        );
        return new PageUtils(page);
    }

    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangpinxinxiEntity> wrapper) {
		  Page<ShangpinxinxiView> page =new Query<ShangpinxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    @Override
	public List<ShangpinxinxiVO> selectListVO(Wrapper<ShangpinxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}

	@Override
	public ShangpinxinxiVO selectVO(Wrapper<ShangpinxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}

	@Override
	public List<ShangpinxinxiView> selectListView(Wrapper<ShangpinxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangpinxinxiView selectView(Wrapper<ShangpinxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
