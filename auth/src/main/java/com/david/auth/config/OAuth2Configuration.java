package com.david.auth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

import javax.sql.DataSource;

/**
 * Created by david100gom on 2017. 9. 4.
 *
 * Github : https://github.com/david100gom
 */
@Configuration
public class OAuth2Configuration {

    @Autowired
    @Qualifier("firstDataSource")
    DataSource dataSource;

    @Bean
    public TokenStore JdbcTokenStore() {
        return new JdbcTokenStore(dataSource);
    }

}