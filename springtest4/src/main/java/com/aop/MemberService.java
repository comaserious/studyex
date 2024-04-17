package com.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MemberService {

    private final MemberDAO memberDAO;

    @Autowired
    public MemberService(MemberDAO memberDAO){
        this.memberDAO=memberDAO;
    }

    public Map<Integer,MemberDTO> getAllMembers(){
        return memberDAO.selectAllMembers();
    }

    public MemberDTO getOneMember(int id){
        return memberDAO.selectMemberById(id);
    }
}
