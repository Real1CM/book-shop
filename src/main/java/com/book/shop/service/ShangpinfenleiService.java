package com.book.shop.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.book.shop.entity.ShangpinfenleiEntity;
import com.book.shop.entity.view.ShangpinfenleiView;
import com.book.shop.entity.vo.ShangpinfenleiVO;
import com.book.shop.utils.PageUtils;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;


/**
 * 商品分类
 */
public interface ShangpinfenleiService extends IService<ShangpinfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);

   	List<ShangpinfenleiVO> selectListVO(Wrapper<ShangpinfenleiEntity> wrapper);

   	ShangpinfenleiVO selectVO(@Param("ew") Wrapper<ShangpinfenleiEntity> wrapper);

   	List<ShangpinfenleiView> selectListView(Wrapper<ShangpinfenleiEntity> wrapper);

   	ShangpinfenleiView selectView(@Param("ew") Wrapper<ShangpinfenleiEntity> wrapper);

   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangpinfenleiEntity> wrapper);


}

