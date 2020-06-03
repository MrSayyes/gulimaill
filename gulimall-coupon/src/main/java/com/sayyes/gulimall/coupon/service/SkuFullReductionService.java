package com.sayyes.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sayyes.common.utils.PageUtils;
import com.sayyes.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author sayyes
 * @email sayyes@gmail.com
 * @date 2020-06-04 00:24:10
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

