
package com.book.shop.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.book.shop.entity.ConfigEntity;
import com.book.shop.utils.PageUtils;
import java.util.Map;


/**
 * 系统用户
 */
public interface ConfigService extends IService<ConfigEntity> {
	PageUtils queryPage(Map<String, Object> params,Wrapper<ConfigEntity> wrapper);
}
