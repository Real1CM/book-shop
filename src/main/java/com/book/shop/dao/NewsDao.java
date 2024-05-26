package com.book.shop.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.book.shop.entity.NewsEntity;
import com.book.shop.entity.view.NewsView;
import com.book.shop.entity.vo.NewsVO;
import java.util.List;
import org.apache.ibatis.annotations.Param;


/**
 * 商品资讯
 */
public interface NewsDao extends BaseMapper<NewsEntity> {

	List<NewsVO> selectListVO(@Param("ew") Wrapper<NewsEntity> wrapper);

	NewsVO selectVO(@Param("ew") Wrapper<NewsEntity> wrapper);

	List<NewsView> selectListView(@Param("ew") Wrapper<NewsEntity> wrapper);

	List<NewsView> selectListView(Pagination page,@Param("ew") Wrapper<NewsEntity> wrapper);

	NewsView selectView(@Param("ew") Wrapper<NewsEntity> wrapper);


}
