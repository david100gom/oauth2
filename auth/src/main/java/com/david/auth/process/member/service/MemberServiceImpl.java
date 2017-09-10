package com.david.auth.process.member.service;

import com.david.auth.process.member.dao.AuthorityRepository;
import com.david.auth.process.member.dao.MemberRepository;
import com.david.auth.process.member.domain.Authority;
import com.david.auth.process.member.domain.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by david100gom on 2017. 9. 10.
 *
 * Github : https://github.com/david100gom
 */
@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    AuthorityRepository authorityRepository;

    /**
     *
     * 권한 정보 매핑
     *
     * @param username
     * @return
     */
    @Override
    public Collection<GrantedAuthority> getAuthorities(String username) {

        List<Authority> list = authorityRepository.findByUsername(username);   // jpa

        List<GrantedAuthority> gaList = new ArrayList<>();

        for(Authority str : list) {
            gaList.add(new SimpleGrantedAuthority(str.getAuthorityName()));
        }

        return gaList;
    }

    /**
     *
     * 권한 체크
     *
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Member member = memberRepository.findByUsername(username);  // jpa

        if(member == null) throw new UsernameNotFoundException("No Data");

        member.setAuthorities(getAuthorities(username));
        return member;
    }
}
