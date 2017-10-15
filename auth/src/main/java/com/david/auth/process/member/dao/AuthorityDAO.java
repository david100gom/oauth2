package com.david.auth.process.member.dao;

import com.david.auth.process.member.domain.Authority;

import java.util.List;

/**
 * Created by david100gom on 2017. 10. 15.
 *
 * Github : https://github.com/david100gom
 */
public interface AuthorityDAO {

    List<Authority> getAuthInfo(String username);
}
