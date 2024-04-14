package com.bbt.form.service.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class UserVO extends BaseVO {
  @Schema(description = "姓名", example = "张三")
  private String name;

  @Schema(description = "登录名", example = "zhangsan")
  private String loginName;

  @Schema(description = "邮箱", example = "tang_hu123@163.com")
  private String email;

  @Schema(description = "电话", example = "123456789")
  private String phone;

  @Schema(description = "密码", example = "1234123412")
  private String password;
}
