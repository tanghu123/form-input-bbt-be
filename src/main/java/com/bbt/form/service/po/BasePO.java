package com.bbt.form.service.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class BasePO {

  @TableId(value = "id", type = IdType.ASSIGN_UUID)
  private String id;

  @TableField("created")
  private LocalDateTime created;

  @TableField("last_modified")
  private LocalDateTime lastModified;

  @TableField("tenant_id")
  private String tenant;

  @TableField("created_user")
  private String createdBy;

  @TableField("last_modified_user")
  private String lastModifiedBy;

  @TableField("version")
  private int version;
}
