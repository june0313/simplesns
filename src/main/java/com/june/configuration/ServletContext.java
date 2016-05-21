package com.june.configuration;

import com.github.jknack.handlebars.springmvc.HandlebarsViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;

/**
 * Created by wayne on 2016. 5. 21..
 */
@Configuration
@ComponentScan(basePackages = "com.june")
public class ServletContext {
	@Bean
	public ViewResolver viewResolver() {
		HandlebarsViewResolver handlebarsViewResolver = new HandlebarsViewResolver();
		handlebarsViewResolver.setPrefix("/WEB-INF/view");
		handlebarsViewResolver.setSuffix(".hbs");
		return handlebarsViewResolver;
	}
}
