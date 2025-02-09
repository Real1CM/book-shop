package com.book.shop.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.book.shop.dao.ShangpinfenleiDao;
import com.book.shop.entity.ShangpinfenleiEntity;
import com.book.shop.entity.view.ShangpinfenleiView;
import com.book.shop.entity.vo.ShangpinfenleiVO;
import com.book.shop.service.ShangpinfenleiService;
import com.book.shop.utils.PageUtils;
import com.book.shop.utils.Query;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service("shangpinfenleiService")
public class ShangpinfenleiServiceImpl extends ServiceImpl<ShangpinfenleiDao, ShangpinfenleiEntity> implements ShangpinfenleiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangpinfenleiEntity> page = this.selectPage(
                new Query<ShangpinfenleiEntity>(params).getPage(),
                new EntityWrapper<ShangpinfenleiEntity>()
        );
        return new PageUtils(page);
    }

    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangpinfenleiEntity> wrapper) {
		  Page<ShangpinfenleiView> page =new Query<ShangpinfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    @Override
	public List<ShangpinfenleiVO> selectListVO(Wrapper<ShangpinfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}

	@Override
	public ShangpinfenleiVO selectVO(Wrapper<ShangpinfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}

	@Override
	public List<ShangpinfenleiView> selectListView(Wrapper<ShangpinfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangpinfenleiView selectView(Wrapper<ShangpinfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
