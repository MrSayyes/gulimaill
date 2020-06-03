package com.sayyes.gulimall.coupon.dao;

import com.sayyes.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author sayyes
 * @email sayyes@gmail.com
 * @date 2020-06-04 00:24:10
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
