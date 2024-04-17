package com.ohgiraffers.springboottest2.thymeleaf.controller;

import com.ohgiraffers.springboottest2.thymeleaf.model.dto.MemberDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/lecture")
public class LectureController {

    @GetMapping("/expression")
    public ModelAndView expression(ModelAndView mv){

        List<MemberDTO> memberList= new ArrayList<>();
        memberList.add(new MemberDTO("j",43,'M',"alangjeon"));
        memberList.add(new MemberDTO("H",64,'M',"SF"));

        mv.addObject(memberList);
        return mv;
    }


}
