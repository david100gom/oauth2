package com.david.auth.process.member.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Collection;

/**
 * Created by david100gom on 2017. 9. 10.
 *
 * Github : https://github.com/david100gom
 */
public interface MemberService extends UserDetailsService {

    // 권한 정보
    public Collection<GrantedAuthority> getAuthorities(String username);

}
