package com.david.api.process.member.web;

import com.david.api.process.member.dao.MemberRepository;
import com.david.api.process.member.domain.Member;
import com.david.api.process.member.domain.MemberData;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Set;
import java.util.logging.Logger;

/**
 * Created by david100gom on 2017. 9. 8.
 *
 * Github : https://github.com/david100gom
 */
@RestController
class MemberContoller {

    @Autowired
    MemberRepository memberRepository;

    @PreAuthorize("#oauth2.hasScope('member.info.public')")
    @RequestMapping("/api/member")
    public Member member(@AuthenticationPrincipal OAuth2Authentication authentication) {

        String username = authentication.getUserAuthentication().getPrincipal().toString();
        Set<String> scopes = authentication.getOAuth2Request().getScope();

        System.out.println("1 -----------"+username+"----");
        System.out.println("2 -----------"+scopes+"----");

        Member member = memberRepository.findByUsername(username);

        return member;
        //return MemberData.from(member, scopes);
    }
}