package com.example.demo.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/lecture")
public class ExpressionMAV {
    @GetMapping("/expression")
    public ModelAndView expression(ModelAndView mv){

        List<MemberDTO> members = new ArrayList<>();

        members.add(new MemberDTO("ho",222,"seoul"));
        members.add(new MemberDTO("ekek",2,"busan"));

        mv.addObject("members",members);


        MemberDTO member=new MemberDTO("gill",3,"sponingpool");


        mv.addObject("member",member);

        PageInfo pageInfo = new PageInfo(1,10,3);
        mv.addObject("page",pageInfo);

        return mv;
    }
}
