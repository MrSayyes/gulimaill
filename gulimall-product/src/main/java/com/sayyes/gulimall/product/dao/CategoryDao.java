package com.sayyes.gulimall.product.dao;

import com.sayyes.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author sayyes
 * @email sayyes@gmail.com
 * @date 2020-06-03 22:13:48
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
