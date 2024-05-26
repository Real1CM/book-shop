package com.book.shop.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.book.shop.entity.StoreupEntity;
import com.book.shop.entity.view.StoreupView;
import com.book.shop.entity.vo.StoreupVO;
import java.util.List;
import org.apache.ibatis.annotations.Param;


/**
 * 收藏
 */
public interface StoreupDao extends BaseMapper<StoreupEntity> {

	List<StoreupVO> selectListVO(@Param("ew") Wrapper<StoreupEntity> wrapper);

	StoreupVO selectVO(@Param("ew") Wrapper<StoreupEntity> wrapper);

	List<StoreupView> selectListView(@Param("ew") Wrapper<StoreupEntity> wrapper);

	List<StoreupView> selectListView(Pagination page,@Param("ew") Wrapper<StoreupEntity> wrapper);

	StoreupView selectView(@Param("ew") Wrapper<StoreupEntity> wrapper);


}
