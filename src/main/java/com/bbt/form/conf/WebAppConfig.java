package com.bbt.form.conf;

import com.bbt.form.web.conf.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

// @Configuration
public class WebAppConfig extends WebMvcConfigurationSupport {
  @Autowired LoginInterceptor loginInterceptor;

  // 实现拦截器 要拦截的路径以及不拦截的路径
  @Override
  public void addInterceptors(InterceptorRegistry registry) {

    // 注册自定义拦截器，添加拦截路径和排除拦截路径
    registry
        .addInterceptor(loginInterceptor)
        .addPathPatterns("/**")
        .excludePathPatterns("/doc.html")
        .excludePathPatterns("/webjars/**");
  }

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    // 配置拦截器访问静态资源
    registry.addResourceHandler("doc.html").addResourceLocations("classpath:/META-INF/resources/");
    registry
        .addResourceHandler("/favicon.ico")
        .addResourceLocations("classpath:/META-INF/resources/");
    registry
        .addResourceHandler("/webjars/**")
        .addResourceLocations("classpath:/META-INF/resources/webjars/");
  }
}
