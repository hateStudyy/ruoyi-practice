package com.ruoyi.web.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author ckl
 * @since 2023/7/24 9:57
 */
@Configuration
@Order(101)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/dev-api/**","/swagger-ui/**", "/v3/api-docs/**").permitAll();  // 为 Swagger API 文档提供无需认证的访问
        // 其他安全配置...
    }
}
