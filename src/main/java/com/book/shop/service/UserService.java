
package com.book.shop.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.book.shop.entity.UserEntity;
import com.book.shop.utils.PageUtils;
import java.util.List;
import java.util.Map;


/**
 * 系统用户
 */
public interface UserService extends IService<UserEntity> {
 	PageUtils queryPage(Map<String, Object> params);

   	List<UserEntity> selectListView(Wrapper<UserEntity> wrapper);

   	PageUtils queryPage(Map<String, Object> params,Wrapper<UserEntity> wrapper);

}
