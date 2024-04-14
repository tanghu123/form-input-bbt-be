package com.bbt.form.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bbt.form.dao.UserDao;
import com.bbt.form.service.po.UserPO;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, UserPO> implements IService<UserPO> {

  @Autowired UserDao userDao;

  public UserPO getUserByName(String name) {
    Optional<UserPO> user =
        userDao.selectList(new LambdaQueryWrapper<UserPO>().eq(UserPO::getLoginName, name)).stream()
            .findFirst();
    if (user.isPresent()) {
      return user.get();
    } else {
      return null;
    }
  }
}
