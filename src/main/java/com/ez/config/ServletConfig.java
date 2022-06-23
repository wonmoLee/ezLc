package com.ez.config;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@ComponentScan(basePackages = {"com.ez.controller"})
public class ServletConfig implements WebMvcConfigurer {
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		InternalResourceViewResolver bean = new InternalResourceViewResolver();
		bean.setViewClass(JstlView.class);
		bean.setPrefix("/WEB-INF/views/");
		bean.setSuffix(".jsp");
		registry.viewResolver(bean);
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resource/**").addResourceLocations("/resources/");
	}
	
	@Bean(name = "multipartResolver")
	public CommonsMultipartResolver getResolver() throws IOException {
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		
		// 10MB
		resolver.setMaxUploadSize(1024 * 1024 * 10); // 한번의 request로 전달될 수 있는 최대크기
		
		// 2MB
		resolver.setMaxUploadSizePerFile(1024 * 1024 * 2); // 하나의 파일 최대 크기
		
		// 1MB
		resolver.setMaxInMemorySize(1024 * 1024); // 메모리상에서 유지하는 최대크기
		
		// temp upload
		resolver.setUploadTempDir(new FileSystemResource("C:\\uploadTest\\tmp")); // 크기 이상의 파일이 임시 저장되는 경로
		
		resolver.setDefaultEncoding("UTF-8");
		
		return resolver;
	}
}
