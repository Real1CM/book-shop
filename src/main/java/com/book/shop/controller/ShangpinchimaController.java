package com.book.shop.controller;

import com.book.shop.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.book.shop.entity.ShangpinchimaEntity;
import com.book.shop.entity.view.ShangpinchimaView;
import com.book.shop.service.ShangpinchimaService;
import com.book.shop.utils.MPUtil;
import com.book.shop.utils.PageUtils;
import com.book.shop.utils.R;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品来源
 */
@RestController
@RequestMapping("/shangpinchima")
public class ShangpinchimaController {
    @Autowired
    private ShangpinchimaService shangpinchimaService;





    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShangpinchimaEntity shangpinchima,
		HttpServletRequest request){
        EntityWrapper<ShangpinchimaEntity> ew = new EntityWrapper<ShangpinchimaEntity>();
		PageUtils page = shangpinchimaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shangpinchima), params), params));

        return R.ok().put("data", page);
    }

    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShangpinchimaEntity shangpinchima,
		HttpServletRequest request){
        EntityWrapper<ShangpinchimaEntity> ew = new EntityWrapper<ShangpinchimaEntity>();
		PageUtils page = shangpinchimaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shangpinchima), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShangpinchimaEntity shangpinchima){
       	EntityWrapper<ShangpinchimaEntity> ew = new EntityWrapper<ShangpinchimaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shangpinchima, "shangpinchima"));
        return R.ok().put("data", shangpinchimaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShangpinchimaEntity shangpinchima){
        EntityWrapper< ShangpinchimaEntity> ew = new EntityWrapper< ShangpinchimaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shangpinchima, "shangpinchima"));
		ShangpinchimaView shangpinchimaView =  shangpinchimaService.selectView(ew);
		return R.ok("查询商品来源成功").put("data", shangpinchimaView);
    }

    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShangpinchimaEntity shangpinchima = shangpinchimaService.selectById(id);
        return R.ok().put("data", shangpinchima);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShangpinchimaEntity shangpinchima = shangpinchimaService.selectById(id);
        return R.ok().put("data", shangpinchima);
    }




    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShangpinchimaEntity shangpinchima, HttpServletRequest request){
    	shangpinchima.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shangpinchima);
        shangpinchimaService.insert(shangpinchima);
        return R.ok();
    }

    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShangpinchimaEntity shangpinchima, HttpServletRequest request){
    	shangpinchima.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shangpinchima);
        shangpinchimaService.insert(shangpinchima);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShangpinchimaEntity shangpinchima, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shangpinchima);
        shangpinchimaService.updateById(shangpinchima);//全部更新
        return R.ok();
    }


    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shangpinchimaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }

    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request,
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);

		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}

		Wrapper<ShangpinchimaEntity> wrapper = new EntityWrapper<ShangpinchimaEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = shangpinchimaService.selectCount(wrapper);
		return R.ok().put("count", count);
	}








}
