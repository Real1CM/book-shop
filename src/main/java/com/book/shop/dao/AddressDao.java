package com.book.shop.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.book.shop.entity.AddressEntity;
import com.book.shop.entity.view.AddressView;
import com.book.shop.entity.vo.AddressVO;
import java.util.List;
import org.apache.ibatis.annotations.Param;


/**
 * 地址
 */
public interface AddressDao extends BaseMapper<AddressEntity> {

	List<AddressVO> selectListVO(@Param("ew") Wrapper<AddressEntity> wrapper);

	AddressVO selectVO(@Param("ew") Wrapper<AddressEntity> wrapper);

	List<AddressView> selectListView(@Param("ew") Wrapper<AddressEntity> wrapper);

	List<AddressView> selectListView(Pagination page,@Param("ew") Wrapper<AddressEntity> wrapper);

	AddressView selectView(@Param("ew") Wrapper<AddressEntity> wrapper);


}
