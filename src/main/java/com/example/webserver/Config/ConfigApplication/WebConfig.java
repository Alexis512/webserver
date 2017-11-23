package com.example.webserver.Config.ConfigApplication;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by Alex Bukhmiller on 20.11.2017.
 */

@Configuration
@EnableWebMvc
@ComponentScan("com.example.webserver")
public class WebConfig implements WebMvcConfigurer {

}
