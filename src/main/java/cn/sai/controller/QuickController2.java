package cn.sai.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuickController2 {

    @Value("${name}")
    private String name;

    @ResponseBody
    @RequestMapping("/quick2")
    public String quick2(){
        //获得配置文件信息
        System.out.println(name);
        return name;
    }
}
