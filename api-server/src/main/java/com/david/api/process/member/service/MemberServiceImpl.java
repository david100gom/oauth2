package com.david.api.process.member.service;

import com.david.api.process.member.dao.MemberDAO;
import com.david.api.process.member.domain.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by david100gom on 2017. 10. 20.
 *
 * Github : https://github.com/david100gom
 */
@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    public MemberDAO memberDAO;


    @Override
    public Member getMemberInfo(String username) {
        return memberDAO.getMemberInfo(username);
    }
}
