package com.bbt.form.web;

import com.bbt.form.service.UserServiceImpl;
import com.bbt.form.service.po.UserPO;
import com.bbt.form.service.utils.JWTUtils;
import com.bbt.form.service.vo.UserVO;
import com.bbt.form.web.dto.LoginUserDTO;
import com.bbt.form.web.utils.Result;
import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

  @Autowired UserServiceImpl userService;

  @GetMapping("/getUserByName")
  public Result<UserPO> getUserByName(@RequestParam String loginName) {
    return Result.success(userService.getUserByName(loginName));
  }

  @PostMapping("/login")
  public Result<Map<String, Object>> login(@RequestBody LoginUserDTO user) {
    log.info("用户名：[{}]", user.getLoginName());
    log.info("密码：[{}]", user.getPassword());

    Map<String, Object> map = new HashMap<>();

    try {
      UserVO userVO = userService.login(user.getLoginName(), user.getPassword());
      Map<String, String> payload = new HashMap<>();
      // 用户登录成功后的信息放入payload
      payload.put("id", userVO.getId());
      payload.put("name", userVO.getName());
      // 生成JWT令牌
      String token = JWTUtils.getToken(payload);
      map.put("state", true);
      map.put("token", token);
      map.put("msg", "认证成功");
    } catch (Exception e) {
      map.put("state", false);
      map.put("msg", e.getMessage());
    }
    return Result.success(map);
  }

  @PostMapping("/user/test")
  public Map<String, Object> test(String token) {
    Map<String, Object> map = new HashMap<>();
    log.info("需要验证token的函数执行了...");
    map.put("state", true);
    map.put("msg", "请求成功");
    return map;
  }
}
