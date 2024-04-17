package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Map;

@Aspect
@Component
public class LogginAspect {

    @Pointcut("execution(* com.aop.*Service.*(..))")
    public void logPointCut(){}

    @Before("logPointCut()")
    public void beforeLog(JoinPoint joinPoint){
        System.out.println("joinPoint 의 주솟값 : " +joinPoint.getTarget());
        System.out.println("joinPoint 의 메소드 시그니쳐 : " +joinPoint.getSignature());


    }

    @After("logPointCut()")
    public void afterLog(JoinPoint joinPoint){
        System.out.println("after joinpoint 주솟값 : " + joinPoint.getTarget());
        System.out.println("after joinpoint 의 메소드 시그니쳐 : "+joinPoint.getSignature());
        if(joinPoint.getArgs().length>0){
            System.out.println("joinpoint 의 첫번째 인수의 값 : "+joinPoint.getArgs()[0]);
        }
    }

    @AfterReturning(pointcut = "logPointCut()", returning = "result")
    public void afterReturningLog(JoinPoint joinPoint,Object result){
        System.out.println("afterreturning 의 result 값 : "+result);
        if(result!=null && result instanceof Map){
            ((Map<Integer,MemberDTO>)result).put(3,new MemberDTO(3,"감감감"));
        }
    }

    @AfterThrowing(pointcut = "logPointCut()",throwing = "exception")
    public void afterThrowing(Throwable exception){
        System.out.println("afterThrowing : "+exception);
    }

    @Around("logPointCut()")
    public Object aroundLog(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("around 시작 합니다");

        Object result = joinPoint.proceed();

        System.out.println("around 끝냅니다");

        return result;
    }




}
