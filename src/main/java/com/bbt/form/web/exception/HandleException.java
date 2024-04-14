package com.bbt.form.web.exception;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class HandleException extends RuntimeException {
  /** 异常状态码信息 */
  private Integer status;

  public HandleException(int status) {
    this.status = status;
  }

  public HandleException(int status, String message) {
    super(message);
    this.status = status;
  }

  /**
   * cause清楚的定位到是哪里的错（异常的起源）
   *
   * @param status 状态码
   * @param message 消息内容
   * @param cause 异常起源
   */
  public HandleException(int status, String message, Throwable cause) {
    super(message, cause);
    this.status = status;
  }

  public HandleException(int status, Throwable cause) {
    super(cause);
    this.status = status;
  }
}
