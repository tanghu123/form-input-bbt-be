package com.bbt.form.web.conf;

import java.lang.annotation.*;

/**
 * 返回放行注解 在类和方法上使用此注解表示不会在ResponseResult类中进一步封装返回值，直接返回原生值
 *
 * @author xlwang55
 */
@Target({ElementType.METHOD, ElementType.TYPE}) // 可以在字段、方法
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ResponseNotIntercept {
  String value() default "";
}
