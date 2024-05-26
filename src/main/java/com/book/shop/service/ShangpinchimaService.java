package com.book.shop.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.book.shop.entity.ShangpinchimaEntity;
import com.book.shop.entity.view.ShangpinchimaView;
import com.book.shop.entity.vo.ShangpinchimaVO;
import com.book.shop.utils.PageUtils;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;


/**
 * 商品来源
 */
public interface ShangpinchimaService extends IService<ShangpinchimaEntity> {

    PageUtils queryPage(Map<String, Object> params);

   	List<ShangpinchimaVO> selectListVO(Wrapper<ShangpinchimaEntity> wrapper);

   	ShangpinchimaVO selectVO(@Param("ew") Wrapper<ShangpinchimaEntity> wrapper);

   	List<ShangpinchimaView> selectListView(Wrapper<ShangpinchimaEntity> wrapper);

   	ShangpinchimaView selectView(@Param("ew") Wrapper<ShangpinchimaEntity> wrapper);

   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangpinchimaEntity> wrapper);


}

