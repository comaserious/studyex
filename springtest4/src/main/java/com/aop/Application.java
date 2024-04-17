package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);
        String[] beans = context.getBeanDefinitionNames();
        for(String bean : beans){
            System.out.println("bean = " + bean);
        }

        MemberService memberService = context.getBean("memberService",MemberService.class);
        //전체 조회
        System.out.println("============ 전체 조회=====================");
        System.out.println(memberService.getAllMembers());

        // id 조회
        System.out.println("================id 조회=======================");
        System.out.println(memberService.getOneMember(1));


        
    }
}
