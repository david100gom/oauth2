package com.david.auth.config;

import com.david.auth.process.member.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/**
 * Created by david100gom on 2017. 9. 10.
 *
 * Github : https://github.com/david100gom
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity web) throws Exception {
    }

    // 일반 폼 인증
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 모두 차단
        http.authorizeRequests().anyRequest().authenticated();
    }

}