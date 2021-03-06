package com.beiming.evidenceplatform.common.enums;

/**
 * Created by zli on 2018/5/7.
 *
 * 平台
 */
public enum PlatformEnum {
  WEB("0", "网页"),
  WECHAT("1", "小程序"),
  MANAGE("2", "后台生成"),
  OTHER("9", "其他");

  private String code;
  private String name;

  PlatformEnum(String code, String name) {
    this.code = code;
    this.name = name;
  }

  public String getCode() {
    return code;
  }

  public String getName() {
    return name;
  }
}
