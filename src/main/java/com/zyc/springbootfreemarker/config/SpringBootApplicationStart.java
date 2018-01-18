package com.zyc.springbootfreemarker.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: zhaoyc
 * @Description:
 * @Date: Created in 9:59 2018/1/18
 * @Modified:
 */
@SpringBootApplication
@Controller
public class SpringBootApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationStart.class,args);
    }
    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "hello world!";
    }
    @RequestMapping("/welcome")
    String welcome(Model model){
        model.addAttribute("toUserName","小明");
        model.addAttribute("message","哈哈");
        model.addAttribute("fromUserName","小红");
        return "t1/welcome";
    }
}
