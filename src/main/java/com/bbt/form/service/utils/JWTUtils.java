package com.bbt.form.service.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import java.util.Calendar;
import java.util.Map;

public class JWTUtils {
  // 密钥
  private static final String SALT = "TangBoHu";

  /** 生成token */
  public static String getToken(Map<String, String> map) {
    Calendar instance = Calendar.getInstance();
    // 默认1天过期
    instance.add(Calendar.DATE, 1);
    // 创建jwt builder
    JWTCreator.Builder builder = JWT.create();

    map.forEach(
        (k, v) -> {
          builder.withClaim(k, v);
        });

    String token =
        builder
            .withExpiresAt(instance.getTime()) // 有效期
            .sign(Algorithm.HMAC256(SALT)); // 密钥
    return token;
  }

  /** 验证token合法性 */
  public static DecodedJWT verify(String token) {
    // 返回验证结果（结果是内置的）
    return JWT.require(Algorithm.HMAC256(SALT)).build().verify(token);
  }
}
