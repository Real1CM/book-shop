package com.book.shop.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.book.shop.entity.ShangpinchimaEntity;
import com.book.shop.entity.view.ShangpinchimaView;
import com.book.shop.entity.vo.ShangpinchimaVO;
import java.util.List;
import org.apache.ibatis.annotations.Param;


/**
 * 商品来源
 */
public interface ShangpinchimaDao extends BaseMapper<ShangpinchimaEntity> {

	List<ShangpinchimaVO> selectListVO(@Param("ew") Wrapper<ShangpinchimaEntity> wrapper);

	ShangpinchimaVO selectVO(@Param("ew") Wrapper<ShangpinchimaEntity> wrapper);

	List<ShangpinchimaView> selectListView(@Param("ew") Wrapper<ShangpinchimaEntity> wrapper);

	List<ShangpinchimaView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinchimaEntity> wrapper);

	ShangpinchimaView selectView(@Param("ew") Wrapper<ShangpinchimaEntity> wrapper);


}
