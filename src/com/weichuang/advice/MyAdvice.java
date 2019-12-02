package com.weichuang.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 自定义通知类
 */
@Aspect
public class MyAdvice {

    @Pointcut("execution(* com.weichuang.service.*Impl.*())")
    public void pc(){}
    /*
       前置通知方法
     */
    @Before("MyAdvice.pc()")
    public void before(){
        System.out.println("前置通知");
    }

    /**
     * 最终通知，相当于try,catch , finally
     */
    @After("MyAdvice.pc()")
    public void after(){
        System.out.println("后置通知");
    }
    /*
        环绕通知
     */
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前通知");
        Object proceed = pjp.proceed();
        System.out.println("环绕后通知");
        return proceed;
    }

    /*
    异常通知
     */
    public void afterThrowing(){
        System.out.println("异常通知");
    }

    /**
     * 正常返回通知
     */
    public void afterReturning(){
        System.out.println("正常返回通知");
    }

}
