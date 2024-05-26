package com.book.shop.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.book.shop.entity.DiscussshangpinxinxiEntity;
import com.book.shop.entity.view.DiscussshangpinxinxiView;
import com.book.shop.entity.vo.DiscussshangpinxinxiVO;
import com.book.shop.utils.PageUtils;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;


/**
 * 商品信息评论表
 */
public interface DiscussshangpinxinxiService extends IService<DiscussshangpinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);

   	List<DiscussshangpinxinxiVO> selectListVO(Wrapper<DiscussshangpinxinxiEntity> wrapper);

   	DiscussshangpinxinxiVO selectVO(@Param("ew") Wrapper<DiscussshangpinxinxiEntity> wrapper);

   	List<DiscussshangpinxinxiView> selectListView(Wrapper<DiscussshangpinxinxiEntity> wrapper);

   	DiscussshangpinxinxiView selectView(@Param("ew") Wrapper<DiscussshangpinxinxiEntity> wrapper);

   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshangpinxinxiEntity> wrapper);


}

