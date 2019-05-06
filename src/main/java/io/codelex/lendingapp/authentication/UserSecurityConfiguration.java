package io.codelex.lendingapp.authentication;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
class UserSecurityConfiguration extends WebSecurityConfigurerAdapter {
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.antMatcher("/api/**")
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/api/sign-in", "/api/register").permitAll()
                .anyRequest().hasRole("CUSTOMER");
    }
}