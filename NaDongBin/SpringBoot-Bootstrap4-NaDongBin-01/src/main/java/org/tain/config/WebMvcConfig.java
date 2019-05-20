package org.tain.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		//registry.addViewController("/").setViewName("index");
		registry.addViewController("/").setViewName("sample03/index");
		registry.addViewController("/home").setViewName("home");

		addViewControllersTemp01(registry);
		addViewControllersSample01(registry);
		addViewControllersSample02(registry);
		addViewControllersSample03(registry);
	}
	
	private void addViewControllersTemp01(ViewControllerRegistry registry) {
		registry.addViewController("/temp01/").setViewName("temp01/index");
		registry.addViewController("/temp01/home").setViewName("temp01/home");
	}
	
	private void addViewControllersSample01(ViewControllerRegistry registry) {
		registry.addViewController("/sample01/").setViewName("sample01/index");
		registry.addViewController("/sample01/instructor").setViewName("sample01/instructor");
		registry.addViewController("/sample01/lecture").setViewName("sample01/lecture");
		registry.addViewController("/sample01/loginForm").setViewName("sample01/loginForm");
		registry.addViewController("/sample01/registerForm").setViewName("sample01/registerForm");
	}

	private void addViewControllersSample02(ViewControllerRegistry registry) {
		registry.addViewController("/sample02/").setViewName("sample02/index");
		registry.addViewController("/sample02/instructor").setViewName("sample02/instructor");
		registry.addViewController("/sample02/lecture").setViewName("sample02/lecture");
		registry.addViewController("/sample02/loginForm").setViewName("sample02/loginForm");
		registry.addViewController("/sample02/registerForm").setViewName("sample02/registerForm");
	}

	private void addViewControllersSample03(ViewControllerRegistry registry) {
		registry.addViewController("/sample03/").setViewName("sample03/index");
		registry.addViewController("/sample03/instructor").setViewName("sample03/instructor");
		registry.addViewController("/sample03/lecture").setViewName("sample03/lecture");
		registry.addViewController("/sample03/loginForm").setViewName("sample03/loginForm");
		registry.addViewController("/sample03/registerForm").setViewName("sample03/registerForm");
	}
}
