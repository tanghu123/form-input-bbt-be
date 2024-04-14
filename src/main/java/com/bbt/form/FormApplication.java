package com.bbt.form;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
@MapperScan({"com.bbt.form.dao"})
public class FormApplication {

  public static void main(String[] args) {
    SpringApplication.run(FormApplication.class, args);
    log.info("应用程序已开启，可以访问！");
  }
}
