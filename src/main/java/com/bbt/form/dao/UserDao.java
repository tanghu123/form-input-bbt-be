package com.bbt.form.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bbt.form.service.po.UserPO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<UserPO> {}
