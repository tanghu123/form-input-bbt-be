package com.bbt.form.web.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginUserDTO {
  @Schema(description = "登录名", example = "zhangsan")
  private String loginName;

  @Schema(description = "密码", example = "1234123412")
  private String password;
}
