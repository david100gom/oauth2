package com.david.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;


/**
 * Created by david100gom on 2017. 9. 2.
 *
 * Github : https://github.com/david100gom
 *
 * @TODO 계정연동 확인필요
 *
 */
@EnableAuthorizationServer
@SpringBootApplication
public class AuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
	}
}
