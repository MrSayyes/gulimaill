package com.sayyes.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sayyes.common.utils.PageUtils;
import com.sayyes.gulimall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author sayyes
 * @email sayyes@gmail.com
 * @date 2020-06-04 00:24:10
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

