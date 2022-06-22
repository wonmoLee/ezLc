package com.ez.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// root-context.xml
// 스프링이 생성하고 관리해야 하는 객체들에 대한 설정파일
@Configuration
@ComponentScan(basePackages = {"com.ez.sample"})
public class RootConfig { 
	
}
