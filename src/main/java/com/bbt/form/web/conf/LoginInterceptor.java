package com.bbt.form.web.conf;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {
    // 在这里实现登录拦截逻辑
    // 这里简单演示，假设登录状态通过Session中的标记来判断
    if (request.getSession().getAttribute("user") != null) {
      // 用户已登录，放行请求
      return true;
    } else {
      // 用户未登录，拦截请求，并重定向到登录页面
      response.sendRedirect("/login");
      return false;
    }
  }

  @Override
  public void postHandle(
      HttpServletRequest request,
      HttpServletResponse response,
      Object handler,
      ModelAndView modelAndView)
      throws Exception {
    // 在请求处理之后调用，但是在视图渲染之前
  }

  @Override
  public void afterCompletion(
      HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
      throws Exception {
    // 在整个请求完成之后调用，一般用于资源清理操作
  }
}
