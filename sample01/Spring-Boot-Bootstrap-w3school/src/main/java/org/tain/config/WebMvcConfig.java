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
		registry.addViewController("/01_menus/Icon_BarH").setViewName("01_menus/Icon_BarH");
		registry.addViewController("/01_menus/Icon_BarV").setViewName("01_menus/Icon_BarV");
		registry.addViewController("/01_menus/Menu_Icon").setViewName("01_menus/Menu_Icon");
		registry.addViewController("/01_menus/Menu_Icon_Animated").setViewName("01_menus/Menu_Icon_Animated");
		registry.addViewController("/01_menus/Accordion").setViewName("01_menus/Accordion");
		registry.addViewController("/01_menus/Tabs").setViewName("01_menus/Tabs");
		registry.addViewController("/01_menus/Tabs_CloseTab").setViewName("01_menus/Tabs_CloseTab");
		registry.addViewController("/01_menus/Tabs_ShowDefault").setViewName("01_menus/Tabs_ShowDefault");
		registry.addViewController("/01_menus/Tabs_Fade").setViewName("01_menus/Tabs_Fade");
		registry.addViewController("/01_menus/Tabs_Toggleable").setViewName("01_menus/Tabs_Toggleable");
		
		registry.addViewController("/02_images/").setViewName("02_images/home");
		
		registry.addViewController("/03_buttons/").setViewName("03_buttons/home");
		
		
		
		
		
		registry.addViewController("/04_forms/").setViewName("04_forms/home");
		
		registry.addViewController("/04_forms/Login").setViewName("04_forms/Login");
		
		registry.addViewController("/04_forms/Form_ClearInputField").setViewName("04_forms/Form_ClearInputField");
		
		registry.addViewController("/04_forms/Form_CopyToClipboard1").setViewName("04_forms/Form_CopyToClipboard1");
		registry.addViewController("/04_forms/Form_CopyToClipboard2").setViewName("04_forms/Form_CopyToClipboard2");
		
		registry.addViewController("/04_forms/Form_CustomCheckbox").setViewName("04_forms/Form_CustomCheckbox");
		registry.addViewController("/04_forms/Form_CustomRadio").setViewName("04_forms/Form_CustomRadio");
		
		registry.addViewController("/04_forms/Form_SelectDefault").setViewName("04_forms/Form_SelectDefault");
		registry.addViewController("/04_forms/Form_SelectCustom").setViewName("04_forms/Form_SelectCustom");

		registry.addViewController("/04_forms/Form_Autocomplete").setViewName("04_forms/Form_Autocomplete");

		registry.addViewController("/04_forms/Form_Validation").setViewName("04_forms/Form_Validation");
		
		
		
		
		
		
		
		registry.addViewController("/05_filters/").setViewName("05_filters/home");
		
		registry.addViewController("/06_tables/").setViewName("06_tables/home");
		
		registry.addViewController("/07_mores/").setViewName("07_mores/home");
		
		registry.addViewController("/08_website/").setViewName("08_website/home");
		
		registry.addViewController("/09_grid/").setViewName("09_grid/home");
		
		registry.addViewController("/10_google/").setViewName("10_google/home");
		
		registry.addViewController("/11_converters/").setViewName("11_converters/home");
		
		registry.addViewController("/12_python/").setViewName("12_python/home");
	}
}
