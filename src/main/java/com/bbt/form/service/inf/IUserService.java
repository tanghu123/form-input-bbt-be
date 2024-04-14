package com.bbt.form.service.inf;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bbt.form.service.po.UserPO;

public interface IUserService extends IService<UserPO> {
  UserPO getUserByName(String loginName);
}
