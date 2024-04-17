package com.java;

import com.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.w3c.dom.ls.LSOutput;

public class Application {


    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationContext.class);

        MemberDTO member = context.getBean("member",MemberDTO.class);

        System.out.println(member);

    }

}
