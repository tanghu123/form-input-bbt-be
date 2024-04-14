package com.bbt.form.service.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BaseVO implements Serializable {
  @Schema(description = "主键id, uuid", example = "adfyadsfsafd")
  private String id;

  @Schema(description = "创建时间", example = "2024-04-11 18:12:18")
  private LocalDateTime created;

  @Schema(description = "上次修改时间", example = "2024-04-11 18:12:18")
  private LocalDateTime lastModified;

  @Schema(description = "租户", example = "BBT")
  private String tenant;

  @Schema(description = "创建用户登录名", example = "zhangsan")
  private String createdBy;

  @Schema(description = "最后一个修改记录的用户登录名", example = "lisi")
  private String lastModifiedBy;

  @Schema(description = "版本-每次修改版本加1", example = "1")
  private int version;
}
