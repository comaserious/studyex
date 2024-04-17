package com.ohgiraffers.demo2.mvc;

import com.ohgiraffers.demo2.common.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private MemberDAO memberDAO;
    @GetMapping("/lecture/expression")
    public ModelAndView expression(ModelAndView mv){

        List<MemberDTO> members = new ArrayList<>();

        members.add(new MemberDTO(1,"leehojun",31,"서울 마포", LocalDateTime.now()));
        members.add(new MemberDTO(2,"jungnjj",29,"서울 송파",LocalDateTime.now()));
        mv.addObject(members);
        MemberDTO memberDTO = new MemberDTO(3,"나임",333,"아랑",LocalDateTime.now());
        mv.addObject(memberDTO);
        return mv;
    }
}
