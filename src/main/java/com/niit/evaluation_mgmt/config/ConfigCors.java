package com.niit.evaluation_mgmt.config;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class ConfigCors implements WebMvcConfigurer{

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		// registry.addMapping("/**")
        //     .allowedOriginPatterns("http://localhost:4200")
        //     .allowedMethods("GET", "POST", "PUT", "DELETE");
	}

    
	

}
    