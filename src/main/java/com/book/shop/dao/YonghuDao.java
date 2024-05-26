package com.book.shop.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.book.shop.entity.YonghuEntity;
import com.book.shop.entity.view.YonghuView;
import com.book.shop.entity.vo.YonghuVO;
import java.util.List;
import org.apache.ibatis.annotations.Param;


/**
 * 用户
 */
public interface YonghuDao extends BaseMapper<YonghuEntity> {

	List<YonghuVO> selectListVO(@Param("ew") Wrapper<YonghuEntity> wrapper);

	YonghuVO selectVO(@Param("ew") Wrapper<YonghuEntity> wrapper);

	List<YonghuView> selectListView(@Param("ew") Wrapper<YonghuEntity> wrapper);

	List<YonghuView> selectListView(Pagination page,@Param("ew") Wrapper<YonghuEntity> wrapper);

	YonghuView selectView(@Param("ew") Wrapper<YonghuEntity> wrapper);


}
