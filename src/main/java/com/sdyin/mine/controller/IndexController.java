package com.sdyin.mine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

/**
 * @author: liuye
 * @Date: 2018/9/28 15:14
 * @Description
 */
@Controller
public class IndexController {

  @RequestMapping("/hello")
  public String helloHtml(HashMap<String, Object> map) {
    map.put("hello", "欢迎进入HTML页面");
    return "/hello";
  }

  @RequestMapping("/home")
  public String home() {

    return "/home";
  }


}
