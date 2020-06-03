package com.sayyes.gulimall.member.dao;

import com.sayyes.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author sayyes
 * @email sayyes@gmail.com
 * @date 2020-06-04 00:44:23
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
