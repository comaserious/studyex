package com.ohgiraffers.demo2.mvc;

import com.ohgiraffers.demo2.common.MemberDTO;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Member;
import java.util.Map;

@Repository
public class MemberDAO {

    private Map<Integer, MemberDTO> map;
    private static int nextId=0;

    public void insert(MemberDTO memberDTO){
        if(map.get(memberDTO.getId())!=null){
            System.out.println("이미 회원임....");
            return;
        }
        map.put(++nextId,memberDTO);
    }


}
