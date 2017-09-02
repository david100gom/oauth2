package com.david.auth.config;

import com.david.auth.interceptor.LoginInfoInterceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by david100gom on 2017. 9. 2.
 *
 * Github : https://github.com/david100gom
 */
@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInfoInterceptor())
                .addPathPatterns("/");
    }

}
