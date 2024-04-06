package com.bbt.form.service.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class BasePO {

  @TableId(value = "id", type = IdType.ASSIGN_ID)
  private String id;

  @TableField("created")
  private LocalDateTime created;

  @TableField("lastModified")
  private LocalDateTime lastModified;

  @TableField("tenant")
  private String tenant;

  @TableField("createdBy")
  private String createdBy;

  @TableField("lastModifiedBy")
  private String lastModifiedBy;

  @TableField("version")
  private int version;
}
