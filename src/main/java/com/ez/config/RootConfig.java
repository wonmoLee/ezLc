package com.ez.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

// root-context.xml
// 스프링이 생성하고 관리해야 하는 객체들에 대한 설정파일
// 스프링이 로딩되면서 읽어들이는 파일
@Configuration
@ComponentScan(basePackages = {"com.ez.sample"})
public class RootConfig { 
	@Bean
	public DataSource dataSource() {
		HikariConfig hikariConfig = new HikariConfig();
		hikariConfig.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		hikariConfig.setJdbcUrl("jdbc:oracle:thin:@61.75.138.220:1521:XE");
		hikariConfig.setUsername("ezLc");
		hikariConfig.setPassword("password를 입력하세요.");
		
		HikariDataSource dataSource = new HikariDataSource(hikariConfig);
		return dataSource;
	}
}
