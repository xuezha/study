package cn.com.cmbc.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yemin on 2017/7/28.
 */
@Controller
// 注解标注此类为springmvc的controller，url映射为"/home"
//@RequestMapping("/home")
public class Controller1 {
    //映射一个action
    @RequestMapping("/hello-world")
    public  String helloWorld(){
        return "hello";
    }
}