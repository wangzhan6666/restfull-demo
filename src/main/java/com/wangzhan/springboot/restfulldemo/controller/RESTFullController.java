package com.wangzhan.springboot.restfulldemo.controller;


import com.wangzhan.springboot.restfulldemo.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTFullController {

    //http://localhost:8888/02-springboot-web/boot/user/111
    //避免了以前的  ?id=111  的方式, 变成了  /111
    //@PathVariable注解时获取URL中的数据
    @RequestMapping("/boot/user/{id}")
    public Object user(@PathVariable("id") Integer id){
        User user = new User();
        user.setId(id);
        user.setName("张三丰");

        return user;
    }

    //http:localhost:8888/02-springboot-web/boot/user/111/wangzhan
    @RequestMapping("/boot/user/{id}/{name}")
    public Object user(@PathVariable("id") Integer id, @PathVariable("name") String name){
        User user = new User();
        user.setId(id);
        user.setName(name);

        return user;
    }
}
