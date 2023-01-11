package com.zql.javabasepractice.controllor;

import com.zql.javabasepractice.annotation.MyAnnotation;
import com.zql.javabasepractice.exception.MyException;
import com.zql.javabasepractice.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")

public class TestControllor {

    @Autowired
    private TestService testService;

    @GetMapping
    @MyAnnotation("test")
    public String test(){
        return "test";
    }

    @GetMapping("{id}")
    public String test2(@PathVariable Integer id){
        if(id>10){
            throw new MyException("id不能大于10");
        }
        return "test2";
    }

}
