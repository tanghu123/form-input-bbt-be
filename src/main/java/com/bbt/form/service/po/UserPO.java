package com.bbt.form.service.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.bbt.form.service.vo.UserVO;
import java.io.Serializable;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
@TableName("user")
public class UserPO extends BasePO implements Serializable {

  @TableField("name")
  private String name;

  @TableField("login_name")
  private String loginName;

  @TableField("email")
  private String email;

  @TableField("phone")
  private String phone;

  @TableField("password")
  private String password;

  public static UserVO toVO(UserPO po) {
    UserVO vo = UserVO.builder().build();
    BeanUtils.copyProperties(po, vo);
    return vo;
  }
}
