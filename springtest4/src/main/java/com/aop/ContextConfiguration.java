package com.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.lang.module.ResolutionException;

@Configuration
@ComponentScan(basePackages = "com.aop")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ContextConfiguration {


}
