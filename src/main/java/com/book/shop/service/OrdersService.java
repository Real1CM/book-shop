package com.book.shop.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.book.shop.entity.OrdersEntity;
import com.book.shop.entity.view.OrdersView;
import com.book.shop.entity.vo.OrdersVO;
import com.book.shop.utils.PageUtils;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;


/**
 * 订单
 */
public interface OrdersService extends IService<OrdersEntity> {

    PageUtils queryPage(Map<String, Object> params);

   	List<OrdersVO> selectListVO(Wrapper<OrdersEntity> wrapper);

   	OrdersVO selectVO(@Param("ew") Wrapper<OrdersEntity> wrapper);

   	List<OrdersView> selectListView(Wrapper<OrdersEntity> wrapper);

   	OrdersView selectView(@Param("ew") Wrapper<OrdersEntity> wrapper);

   	PageUtils queryPage(Map<String, Object> params,Wrapper<OrdersEntity> wrapper);


    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<OrdersEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<OrdersEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<OrdersEntity> wrapper);
}

