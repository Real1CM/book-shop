package com.book.shop.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.book.shop.entity.CartEntity;
import com.book.shop.entity.view.CartView;
import com.book.shop.entity.vo.CartVO;
import java.util.List;
import org.apache.ibatis.annotations.Param;


/**
 * 购物车表
 */
public interface CartDao extends BaseMapper<CartEntity> {

	List<CartVO> selectListVO(@Param("ew") Wrapper<CartEntity> wrapper);

	CartVO selectVO(@Param("ew") Wrapper<CartEntity> wrapper);

	List<CartView> selectListView(@Param("ew") Wrapper<CartEntity> wrapper);

	List<CartView> selectListView(Pagination page,@Param("ew") Wrapper<CartEntity> wrapper);

	CartView selectView(@Param("ew") Wrapper<CartEntity> wrapper);


}
