package com.sayyes.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sayyes.common.utils.PageUtils;
import com.sayyes.gulimall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author sayyes
 * @email sayyes@gmail.com
 * @date 2020-06-04 01:07:57
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

