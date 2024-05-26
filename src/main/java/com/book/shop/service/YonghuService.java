package com.book.shop.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.book.shop.entity.YonghuEntity;
import com.book.shop.entity.view.YonghuView;
import com.book.shop.entity.vo.YonghuVO;
import com.book.shop.utils.PageUtils;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;


/**
 * 用户
 */
public interface YonghuService extends IService<YonghuEntity> {

    PageUtils queryPage(Map<String, Object> params);

   	List<YonghuVO> selectListVO(Wrapper<YonghuEntity> wrapper);

   	YonghuVO selectVO(@Param("ew") Wrapper<YonghuEntity> wrapper);

   	List<YonghuView> selectListView(Wrapper<YonghuEntity> wrapper);

   	YonghuView selectView(@Param("ew") Wrapper<YonghuEntity> wrapper);

   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghuEntity> wrapper);


}

