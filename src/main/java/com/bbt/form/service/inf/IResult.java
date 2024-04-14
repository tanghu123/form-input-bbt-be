package com.bbt.form.service.inf;

public interface IResult {
  /**
   * 获取状态码
   *
   * @return 状态码
   */
  Integer getCode();

  /**
   * 获取消息体
   *
   * @return 消息体
   */
  String getMessage();
}
