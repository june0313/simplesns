package com.june.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wayne on 2016. 5. 21..
 */
@Configuration
@ComponentScan(basePackages = {"com.june.simplesns.domain", "com.june.simplesns.repository", "com.june.simplesns.service"})
public class ApplicationContext {

}
