package com.sean.springbootjwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	@Bean(name = BeanIds.AUTHENTICATION_MANAGER)
	@Primary
	public AuthenticationManager authenticationManagerBean() throws Exception {
	    return super.authenticationManager();
	}
	/*
	@Override
    protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.anonymous()
		.and()
		.authorizeRequests()
		.antMatchers("/demo2").authorizeRequests().anyRequest().permitAll()
		.and()
		.authorizeRequests()
        .anyRequest().authenticated();
	}
	*/
	
	@Override
	public void configure(WebSecurity web) throws Exception {
	    web.ignoring().antMatchers("/oauth/token", "/signup");
	}
	
}
