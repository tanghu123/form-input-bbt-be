package com.bbt.form.web;

import com.bbt.form.service.UserServiceImpl;
import com.bbt.form.service.po.UserPO;
import com.bbt.form.web.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired UserServiceImpl userService;

  @GetMapping("/getUserByName")
  public Result<UserPO> getUserByName(@RequestParam String loginName) {
    return Result.success(userService.getUserByName(loginName));
  }
}
