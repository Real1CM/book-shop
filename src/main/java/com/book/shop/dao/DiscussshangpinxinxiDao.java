package com.book.shop.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.book.shop.entity.DiscussshangpinxinxiEntity;
import com.book.shop.entity.view.DiscussshangpinxinxiView;
import com.book.shop.entity.vo.DiscussshangpinxinxiVO;
import java.util.List;
import org.apache.ibatis.annotations.Param;


/**
 * 商品信息评论表
 */
public interface DiscussshangpinxinxiDao extends BaseMapper<DiscussshangpinxinxiEntity> {

	List<DiscussshangpinxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussshangpinxinxiEntity> wrapper);

	DiscussshangpinxinxiVO selectVO(@Param("ew") Wrapper<DiscussshangpinxinxiEntity> wrapper);

	List<DiscussshangpinxinxiView> selectListView(@Param("ew") Wrapper<DiscussshangpinxinxiEntity> wrapper);

	List<DiscussshangpinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshangpinxinxiEntity> wrapper);

	DiscussshangpinxinxiView selectView(@Param("ew") Wrapper<DiscussshangpinxinxiEntity> wrapper);


}
