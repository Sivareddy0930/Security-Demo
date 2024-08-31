package com.example.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig{
	
//	@Bean
//	private SecurityFilterChain filterchain(HttpSecurity http) throws Exception  {
//		
//		return http.csrf().disable()
//					.authorizeHttpRequests().requestMatchers("/get").permitAll()
////					.and().authorizeHttpRequests().requestMatchers("getAll").authenticated()
//					.and().formLogin()
//					.and().build();				
//		
//	}
	
	
	@Bean
	private SecurityFilterChain filterchain(HttpSecurity http) throws Exception  {
		
		return http.csrf().disable()
					.authorizeHttpRequests(authorize->authorize.requestMatchers("/get").permitAll())
					.authorizeHttpRequests().requestMatchers("").authenticated()
					.and().httpBasic()
					.and().build();				
		
	}
	
}
