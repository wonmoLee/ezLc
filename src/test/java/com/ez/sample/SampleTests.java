package com.ez.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ez.config.RootConfig;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class) // spring-test 모듈을 활용해 스프링 가동
@ContextConfiguration(classes = {RootConfig.class}) // Bean등록을 위한 경로설정
@Log4j // Lombok을 이용해 로그를 기록하는 Logger 변수 생성
public class SampleTests {
	@Setter(onMethod_ = {@Autowired}) // @Autowired는 스프링으로부터 자동으로 주입해달라는 표시
	private Restaurant restaurant;
	
	@Test // Junit에서 테스트 대상을 표시하는 annotation
	public void testExist() {
		assertNotNull(restaurant); // assertNotNull은 인자가 null이 아니어야만 테스트가 성공한다는 것을 의미
		
		log.info(restaurant);
		log.info("---------------------------------------");
		log.info(restaurant.getChef());
	}
}
