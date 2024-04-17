package com.java;

import com.common.Account;
import com.common.MemberDTO;
import com.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationContext {

    @Bean
    public Account account(){
        return new PersonalAccount(12,"12130-1212-121213");
    }
    @Bean
    public MemberDTO member(){
        return new MemberDTO("아무개",22,"dddong@gmail.com",account());
    }
}
