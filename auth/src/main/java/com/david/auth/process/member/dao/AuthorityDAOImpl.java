package com.david.auth.process.member.dao;

import com.david.auth.process.member.domain.Authority;
import com.david.auth.process.member.domain.Member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by david100gom on 2017. 10. 15.
 *
 * Github : https://github.com/david100gom
 */
@Repository
public class AuthorityDAOImpl implements AuthorityDAO{

    @Autowired
    @Qualifier("firstSqlSessionTemplate")
    private SqlSession sqlSession;

    @Override
    public List<Authority> getAuthInfo(String username) {
        return sqlSession.selectList("memberDAO.GET_AUTH_INFO", username);
    }
}
