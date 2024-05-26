package com.book.shop.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.book.shop.entity.StoreupEntity;
import com.book.shop.entity.view.StoreupView;
import com.book.shop.entity.vo.StoreupVO;
import com.book.shop.utils.PageUtils;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;


/**
 * 收藏表
 */
public interface StoreupService extends IService<StoreupEntity> {

    PageUtils queryPage(Map<String, Object> params);

   	List<StoreupVO> selectListVO(Wrapper<StoreupEntity> wrapper);

   	StoreupVO selectVO(@Param("ew") Wrapper<StoreupEntity> wrapper);

   	List<StoreupView> selectListView(Wrapper<StoreupEntity> wrapper);

   	StoreupView selectView(@Param("ew") Wrapper<StoreupEntity> wrapper);

   	PageUtils queryPage(Map<String, Object> params,Wrapper<StoreupEntity> wrapper);


}

