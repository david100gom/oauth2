package com.david.api.process.member.dao;

import com.david.api.process.member.domain.Member;

/**
 * Created by david100gom on 2017. 10. 20.
 *
 * Github : https://github.com/david100gom
 */
public interface MemberDAO {

    public Member getMemberInfo(String username);
}

