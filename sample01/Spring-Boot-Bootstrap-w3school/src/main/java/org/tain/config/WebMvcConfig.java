package org.tain.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/home").setViewName("home");
		
		registry.addViewController("/01_menus/").setViewName("01_menus/home");
		registry.addViewController("/02_images/").setViewName("02_images/home");
		registry.addViewController("/03_buttons/").setViewName("03_buttons/home");
		registry.addViewController("/04_forms/").setViewName("04_forms/home");
		registry.addViewController("/05_filters/").setViewName("05_filters/home");
		registry.addViewController("/06_tables/").setViewName("06_tables/home");
		registry.addViewController("/07_mores/").setViewName("07_mores/home");
		registry.addViewController("/08_website/").setViewName("08_website/home");
		registry.addViewController("/09_grid/").setViewName("09_grid/home");
		registry.addViewController("/10_google/").setViewName("10_google/home");
		registry.addViewController("/11_converters/").setViewName("11_converters/home");
		registry.addViewController("/12_python/").setViewName("12_python/home");
		
		registry.addViewController("/login").setViewName("login");
		registry.addViewController("/hello").setViewName("hello");
	}
}
