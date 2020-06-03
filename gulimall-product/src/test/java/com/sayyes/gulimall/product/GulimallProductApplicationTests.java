package com.sayyes.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sayyes.gulimall.product.entity.BrandEntity;
import com.sayyes.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        //插入
//        brandEntity.setDescript("华为");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");

        //更新
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("中兴");
//        brandService.updateById(brandEntity);

        //删除
//        brandService.removeById(2L);

        //查询
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((item)->{
            System.out.println(item);
        });
    }

}
