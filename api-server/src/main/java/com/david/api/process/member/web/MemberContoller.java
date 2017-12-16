package com.david.api.process.member.web;


import com.david.api.process.member.domain.Member;
import com.david.api.process.member.service.MemberService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by david100gom on 2017. 9. 8.
 *
 * Github : https://github.com/david100gom
 */
@RestController
class MemberContoller {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public MemberService memberService;

    @PostMapping("/api/member")
    public Member member(@AuthenticationPrincipal OAuth2Authentication authentication) {

        String username = authentication.getUserAuthentication().getPrincipal().toString();

        Set<String> scopes = authentication.getOAuth2Request().getScope();

        Collection<GrantedAuthority> list = (Collection<GrantedAuthority>)authentication.getUserAuthentication().getAuthorities();

        for(GrantedAuthority g : list) {
            System.out.println("GrantedAuthority -----------"+g.getAuthority()+"----");
        }

        Member member = memberService.getMemberInfo(username);

        return member;
    }

    @PutMapping("/members/{data}")
    public Member member(HttpServletRequest request, @PathVariable String data, @RequestBody Member data2) {
        logger.error(" data : {}", data);
        logger.error(" data2 : {}", data2);
        Member member = memberService.getMemberInfo((String)request.getAttribute("username"));
        return member;
    }
}