package com.book.shop.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.book.shop.entity.AddressEntity;
import com.book.shop.entity.view.AddressView;
import com.book.shop.entity.vo.AddressVO;
import com.book.shop.utils.PageUtils;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;


/**
 * 地址
 */
public interface AddressService extends IService<AddressEntity> {

    PageUtils queryPage(Map<String, Object> params);

   	List<AddressVO> selectListVO(Wrapper<AddressEntity> wrapper);

   	AddressVO selectVO(@Param("ew") Wrapper<AddressEntity> wrapper);

   	List<AddressView> selectListView(Wrapper<AddressEntity> wrapper);

   	AddressView selectView(@Param("ew") Wrapper<AddressEntity> wrapper);

   	PageUtils queryPage(Map<String, Object> params,Wrapper<AddressEntity> wrapper);


}

