package com.david.api.config;

import com.david.api.interceptor.LoginInfoInterceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Set;

/**
 * Created by david100gom on 2017. 9. 13.
 *
 * Github : https://github.com/david100gom
 */
@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new LoginInfoInterceptor())
                .addPathPatterns("/**");
    }

}
