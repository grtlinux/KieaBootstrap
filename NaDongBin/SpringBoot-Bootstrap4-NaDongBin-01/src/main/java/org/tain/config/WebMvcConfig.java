package org.tain.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		//registry.addViewController("/").setViewName("index");
		registry.addViewController("/").setViewName("sample05/index");
		registry.addViewController("/home").setViewName("home");

		addViewControllersTemp01(registry);
		addViewControllersSample01(registry);
		addViewControllersSample02(registry);
		addViewControllersSample03(registry);
		addViewControllersSample04(registry);
		addViewControllersSample05(registry);
		addViewControllersSample06(registry);
		addViewControllersSample07(registry);
		addViewControllersSample08(registry);
		addViewControllersSample09(registry);
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

	private void addViewControllersSample04(ViewControllerRegistry registry) {
		registry.addViewController("/sample04/").setViewName("sample04/index");
		registry.addViewController("/sample04/instructor").setViewName("sample04/instructor");
		registry.addViewController("/sample04/lecture").setViewName("sample04/lecture");
		registry.addViewController("/sample04/loginForm").setViewName("sample04/loginForm");
		registry.addViewController("/sample04/registerForm").setViewName("sample04/registerForm");
	}

	private void addViewControllersSample05(ViewControllerRegistry registry) {
		registry.addViewController("/sample05/").setViewName("sample05/index");
		registry.addViewController("/sample05/instructor").setViewName("sample05/instructor");
		registry.addViewController("/sample05/lecture").setViewName("sample05/lecture");
		registry.addViewController("/sample05/loginForm").setViewName("sample05/loginForm");
		registry.addViewController("/sample05/registerForm").setViewName("sample05/registerForm");
	}

	private void addViewControllersSample06(ViewControllerRegistry registry) {
		registry.addViewController("/sample06/").setViewName("sample06/index");
		registry.addViewController("/sample06/instructor").setViewName("sample06/instructor");
		registry.addViewController("/sample06/lecture").setViewName("sample06/lecture");
		registry.addViewController("/sample06/loginForm").setViewName("sample06/loginForm");
		registry.addViewController("/sample06/registerForm").setViewName("sample06/registerForm");
	}

	private void addViewControllersSample07(ViewControllerRegistry registry) {
		registry.addViewController("/sample07/").setViewName("sample07/index");
		registry.addViewController("/sample07/instructor").setViewName("sample07/instructor");
		registry.addViewController("/sample07/lecture").setViewName("sample07/lecture");
		registry.addViewController("/sample07/loginForm").setViewName("sample07/loginForm");
		registry.addViewController("/sample07/registerForm").setViewName("sample07/registerForm");
	}

	private void addViewControllersSample08(ViewControllerRegistry registry) {
		registry.addViewController("/sample08/").setViewName("sample08/index");
		registry.addViewController("/sample08/instructor").setViewName("sample08/instructor");
		registry.addViewController("/sample08/lecture").setViewName("sample08/lecture");
		registry.addViewController("/sample08/loginForm").setViewName("sample08/loginForm");
		registry.addViewController("/sample08/registerForm").setViewName("sample08/registerForm");
	}

	private void addViewControllersSample09(ViewControllerRegistry registry) {
		registry.addViewController("/sample09/").setViewName("sample09/index");
		registry.addViewController("/sample09/instructor").setViewName("sample09/instructor");
		registry.addViewController("/sample09/lecture").setViewName("sample09/lecture");
		registry.addViewController("/sample09/loginForm").setViewName("sample09/loginForm");
		registry.addViewController("/sample09/registerForm").setViewName("sample09/registerForm");
	}
}
