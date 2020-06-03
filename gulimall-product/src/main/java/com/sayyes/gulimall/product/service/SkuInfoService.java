package com.sayyes.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sayyes.common.utils.PageUtils;
import com.sayyes.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author sayyes
 * @email sayyes@gmail.com
 * @date 2020-06-03 22:13:49
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

