package spring.join;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.data.MemberDAO;

@Service
public class MemberRegisterService {

    private MemberDAO memberDAO;

    @Autowired
    public MemberRegisterService(MemberDAO memberDAO){
        this.memberDAO=memberDAO;
    }

}
