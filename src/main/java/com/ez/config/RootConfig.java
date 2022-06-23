package com.ez.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
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
@MapperScan(basePackages = {"com.ez.mapper"})
public class RootConfig { 
	//커넥션풀 등록
	@Bean
	public DataSource dataSource() {
		HikariConfig hikariConfig = new HikariConfig();
		hikariConfig.setDriverClassName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
		hikariConfig.setJdbcUrl("jdbc:log4jdbc:oracle:thin:@61.75.138.220:1521:XE");
		hikariConfig.setUsername("ezLc");
		hikariConfig.setPassword("ezinc1234~~");
		
		HikariDataSource dataSource = new HikariDataSource(hikariConfig);
		return dataSource;
	}
	
	// Mybatis 객체 SqlSessionFactory 등록
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(dataSource());
		return (SqlSessionFactory) sqlSessionFactory.getObject();
	}
}
