package com.book.shop.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.book.shop.dao.ShangpinchimaDao;
import com.book.shop.entity.ShangpinchimaEntity;
import com.book.shop.entity.view.ShangpinchimaView;
import com.book.shop.entity.vo.ShangpinchimaVO;
import com.book.shop.service.ShangpinchimaService;
import com.book.shop.utils.PageUtils;
import com.book.shop.utils.Query;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service("shangpinchimaService")
public class ShangpinchimaServiceImpl extends ServiceImpl<ShangpinchimaDao, ShangpinchimaEntity> implements ShangpinchimaService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangpinchimaEntity> page = this.selectPage(
                new Query<ShangpinchimaEntity>(params).getPage(),
                new EntityWrapper<ShangpinchimaEntity>()
        );
        return new PageUtils(page);
    }

    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangpinchimaEntity> wrapper) {
		  Page<ShangpinchimaView> page =new Query<ShangpinchimaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    @Override
	public List<ShangpinchimaVO> selectListVO(Wrapper<ShangpinchimaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}

	@Override
	public ShangpinchimaVO selectVO(Wrapper<ShangpinchimaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}

	@Override
	public List<ShangpinchimaView> selectListView(Wrapper<ShangpinchimaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangpinchimaView selectView(Wrapper<ShangpinchimaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
