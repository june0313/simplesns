package com.june.configuration;

import com.github.jknack.handlebars.springmvc.HandlebarsViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by wayne on 2016. 5. 21..
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.june.simplesns.web")
public class ServletContext extends WebMvcConfigurerAdapter {
	@Bean
	public ViewResolver viewResolver() {
		HandlebarsViewResolver handlebarsViewResolver = new HandlebarsViewResolver();
		handlebarsViewResolver.setPrefix("/WEB-INF/view");
		handlebarsViewResolver.setSuffix(".hbs");
		return handlebarsViewResolver;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/css/**").addResourceLocations("/WEB-INF/css/");
	}
}
