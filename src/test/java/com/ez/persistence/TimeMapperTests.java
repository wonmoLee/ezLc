package com.ez.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ez.config.RootConfig;
import com.ez.mapper.TimeMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
@Log4j
public class TimeMapperTests {
	@Setter(onMethod_ = @Autowired)
	private TimeMapper timeMapper;
	
	@Test
	public void testGetTime() {
		log.info("getTime");
		log.info(timeMapper.getTime());
	}
}
