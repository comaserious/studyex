package com.aop;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class MemberDAO {

    private final Map<Integer,MemberDTO> members;
    public MemberDAO(){
        members = new HashMap<>();
        members.put(1,new MemberDTO(1,"아무개"));
        members.put(2, new MemberDTO(2,"dondondond"));
    }

    public Map<Integer,MemberDTO> selectAllMembers(){
        return members;
    }

    public MemberDTO selectMemberById(int id) throws RuntimeException {
        if(members.get(id)==null){
            throw new RuntimeException("해당 id 의 회원이 존재하지 않습니다");
        }
        return members.get(id);
    }
}
