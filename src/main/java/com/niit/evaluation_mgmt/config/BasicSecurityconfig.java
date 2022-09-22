package com.niit.evaluation_mgmt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
public class BasicSecurityconfig { 

  @Bean
  public UserDetailsService userDetailsService(PasswordEncoder bCryptPasswordEncoder) {
    InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
    // manager.createUser(User.withUsername("gestionnaire")
    //     .password(bCryptPasswordEncoder.encode("gestPass"))
    //     .roles("GESTIONNAIRE")
    //     .build());
    // manager.createUser(User.withUsername("formateur")
    //     .password(bCryptPasswordEncoder.encode("formPass"))
    //     .roles("FORMATEUR")
    //     .build());
    // manager.createUser(User.withUsername("apprenant")
    //     .password(bCryptPasswordEncoder.encode("apprPass"))
    //     .roles("APPRENANT")
    //     .build());
    manager.createUser(User.withUsername("admin")
        .password(bCryptPasswordEncoder.encode("adminPass"))
        .roles("ADMIN")
        .build());
    return manager;
  }

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http.csrf()
        .disable()
        .authorizeRequests()
        .anyRequest()
        .authenticated()
        .and()
        .httpBasic()
        .and()
        .sessionManagement()
        .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    return http.build();
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
    
  }

  @Bean
public WebSecurityCustomizer webSecurityCustomizer() {
    
    return (web) -> web.debug(true)
      .ignoring()
      .antMatchers("/h2-console/**"
      );
}
}