package com.hotel.booking.config.init;

import javax.servlet.Filter;

import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.hotel.booking.config.DataAccessConfig;
import com.hotel.booking.config.SecurityConfig;
import com.hotel.booking.config.WebFlowConfig;
import com.hotel.booking.config.WebMvcConfig;

public class DispatcherServletInitializer  extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {
			SecurityConfig.class,
			DataAccessConfig.class,
			WebMvcConfig.class,
			WebFlowConfig.class
		};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	@Override
	protected Filter[] getServletFilters() {
		return new Filter[] { new HiddenHttpMethodFilter() };
	}

}
