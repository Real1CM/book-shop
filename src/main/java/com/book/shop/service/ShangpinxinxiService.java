package com.book.shop.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.book.shop.entity.ShangpinxinxiEntity;
import com.book.shop.entity.view.ShangpinxinxiView;
import com.book.shop.entity.vo.ShangpinxinxiVO;
import com.book.shop.utils.PageUtils;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;


/**
 * 商品信息
 */
public interface ShangpinxinxiService extends IService<ShangpinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);

   	List<ShangpinxinxiVO> selectListVO(Wrapper<ShangpinxinxiEntity> wrapper);

   	ShangpinxinxiVO selectVO(@Param("ew") Wrapper<ShangpinxinxiEntity> wrapper);

   	List<ShangpinxinxiView> selectListView(Wrapper<ShangpinxinxiEntity> wrapper);

   	ShangpinxinxiView selectView(@Param("ew") Wrapper<ShangpinxinxiEntity> wrapper);

   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangpinxinxiEntity> wrapper);


}

