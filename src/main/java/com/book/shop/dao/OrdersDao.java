package com.book.shop.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.book.shop.entity.OrdersEntity;
import com.book.shop.entity.view.OrdersView;
import com.book.shop.entity.vo.OrdersVO;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;


/**
 * 订单
 */
public interface OrdersDao extends BaseMapper<OrdersEntity> {

	List<OrdersVO> selectListVO(@Param("ew") Wrapper<OrdersEntity> wrapper);

	OrdersVO selectVO(@Param("ew") Wrapper<OrdersEntity> wrapper);

	List<OrdersView> selectListView(@Param("ew") Wrapper<OrdersEntity> wrapper);

	List<OrdersView> selectListView(Pagination page,@Param("ew") Wrapper<OrdersEntity> wrapper);

	OrdersView selectView(@Param("ew") Wrapper<OrdersEntity> wrapper);


    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<OrdersEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<OrdersEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<OrdersEntity> wrapper);
}
