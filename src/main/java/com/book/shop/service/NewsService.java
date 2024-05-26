package com.book.shop.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.book.shop.entity.NewsEntity;
import com.book.shop.entity.view.NewsView;
import com.book.shop.entity.vo.NewsVO;
import com.book.shop.utils.PageUtils;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;


/**
 * 商品资讯
 *
 */
public interface NewsService extends IService<NewsEntity> {

    PageUtils queryPage(Map<String, Object> params);

   	List<NewsVO> selectListVO(Wrapper<NewsEntity> wrapper);

   	NewsVO selectVO(@Param("ew") Wrapper<NewsEntity> wrapper);

   	List<NewsView> selectListView(Wrapper<NewsEntity> wrapper);

   	NewsView selectView(@Param("ew") Wrapper<NewsEntity> wrapper);

   	PageUtils queryPage(Map<String, Object> params,Wrapper<NewsEntity> wrapper);


}

