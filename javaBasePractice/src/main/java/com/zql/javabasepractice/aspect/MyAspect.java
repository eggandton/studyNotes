package com.zql.javabasepractice.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Pointcut("@annotation(com.zql.javabasepractice.annotation.MyAnnotation)")
    public void pointCut(){
    }

    @Before("pointCut()")
    public void before(){
        System.out.println("before");
    }





}
