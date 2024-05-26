package com.book.shop.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.book.shop.entity.ShangpinxinxiEntity;
import com.book.shop.entity.view.ShangpinxinxiView;
import com.book.shop.entity.vo.ShangpinxinxiVO;
import java.util.List;
import org.apache.ibatis.annotations.Param;


/**
 * 商品信息
 *
 * @author
 * @email
 * @date 2022-04-23 15:55:08
 */
public interface ShangpinxinxiDao extends BaseMapper<ShangpinxinxiEntity> {

	List<ShangpinxinxiVO> selectListVO(@Param("ew") Wrapper<ShangpinxinxiEntity> wrapper);

	ShangpinxinxiVO selectVO(@Param("ew") Wrapper<ShangpinxinxiEntity> wrapper);

	List<ShangpinxinxiView> selectListView(@Param("ew") Wrapper<ShangpinxinxiEntity> wrapper);

	List<ShangpinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinxinxiEntity> wrapper);

	ShangpinxinxiView selectView(@Param("ew") Wrapper<ShangpinxinxiEntity> wrapper);


}
