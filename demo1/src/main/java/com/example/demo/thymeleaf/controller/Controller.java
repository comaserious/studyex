package com.example.demo.thymeleaf.controller;

import com.example.demo.thymeleaf.dto.MemberDTO;
import com.example.demo.thymeleaf.dto.PageCriteria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping("/lecture")
public class Controller {

    @GetMapping("/expression")
    public ModelAndView exspression(ModelAndView mv){

        List<MemberDTO> memberList= new ArrayList<>();
        memberList.add(new MemberDTO("홍길동",22,"서울시 마포구"));
        memberList.add(new MemberDTO("고길동",55,"서울시 송파구"));

        MemberDTO member = new MemberDTO("Lollolo",44,"SF");

        mv.addObject("memberList",memberList);
        mv.addObject("member",member);

        mv.addObject("str","<h1>제목 달리냐?</h1>");

        mv.addObject("pages",new PageCriteria(1,10,4));

        return mv;
    }
}
