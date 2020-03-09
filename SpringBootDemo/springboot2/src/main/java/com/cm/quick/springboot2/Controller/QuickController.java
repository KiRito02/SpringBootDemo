package com.cm.quick.springboot2.Controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@ConfigurationProperties(prefix = "person")
public class QuickController {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @RequestMapping("/quick2")
    @ResponseBody
    public String quic2(){
        return "PlayStation 4";
    }

    @RequestMapping("/quick3")
    @ResponseBody
    public String quick3(){
        return "name:"+name+","+"age:"+age;
    }
}
