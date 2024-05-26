package com.book.shop.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.book.shop.entity.ShangpinfenleiEntity;
import com.book.shop.entity.view.ShangpinfenleiView;
import com.book.shop.entity.vo.ShangpinfenleiVO;
import java.util.List;
import org.apache.ibatis.annotations.Param;


/**
 * 商品分类
 */
public interface ShangpinfenleiDao extends BaseMapper<ShangpinfenleiEntity> {

	List<ShangpinfenleiVO> selectListVO(@Param("ew") Wrapper<ShangpinfenleiEntity> wrapper);

	ShangpinfenleiVO selectVO(@Param("ew") Wrapper<ShangpinfenleiEntity> wrapper);

	List<ShangpinfenleiView> selectListView(@Param("ew") Wrapper<ShangpinfenleiEntity> wrapper);

	List<ShangpinfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinfenleiEntity> wrapper);

	ShangpinfenleiView selectView(@Param("ew") Wrapper<ShangpinfenleiEntity> wrapper);


}
