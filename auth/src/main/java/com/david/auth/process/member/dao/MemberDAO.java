package com.david.auth.process.member.dao;

import com.david.auth.process.member.domain.Member;

/**
 * Created by david100gom on 2017. 10. 15.
 *
 * Github : https://github.com/david100gom
 */
public interface MemberDAO {

    public Member getUserInfo(String username);
}
