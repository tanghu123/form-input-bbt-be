package com.bbt.form.web.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/** 要让这个类生效，必须让项目可以扫描到这个类所在的包，将其加入Spring容器。启动类的注解上添加扫描包信息 */
@ControllerAdvice // 会拦截所有加了@Controller的类,相当于给所有的controller写了一个try
@Slf4j
public class ControllerExceptionAdvice {
  /**
   * 统一异常处理方法，@ExceptionHandler(HandleException.class)声明这个方法处理RuntimeException这样的异常
   *
   * @param e 捕获到的异常
   * @return 返回给页面的状态码和信息
   */
  @ExceptionHandler(HandleException.class) // 相当于catch
  public ResponseEntity<String> handleProjectException(HandleException e) {
    return ResponseEntity.status(e.getStatus())
        .contentType(MediaType.APPLICATION_JSON)
        .body(e.getMessage());
  }
}
