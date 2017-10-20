package com.david.api.process.member.dao;

import com.david.api.process.member.domain.Member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * Created by david100gom on 2017. 10. 20.
 *
 * Github : https://github.com/david100gom
 */
@Repository
public class MemberDAOImpl implements MemberDAO{

    @Autowired
    @Qualifier("firstSqlSessionTemplate")
    private SqlSession sqlSession;

    @Override
    public Member getMemberInfo(String username) {
        return sqlSession.selectOne("memberDAO.GET_MEMBER_INFO", username);
    }
}
