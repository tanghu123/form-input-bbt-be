package com.bbt.form.service.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

@Data
@TableName("user")
public class UserPO extends BasePO implements Serializable {

  @TableField("loginName")
  private String loginName;

  @TableField("email")
  private String email;

  @TableField("phone")
  private String phone;

  @TableField("password")
  private String password;
}
