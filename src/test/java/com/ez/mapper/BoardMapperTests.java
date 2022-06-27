package com.ez.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ez.domain.BoardVO;
import com.ez.mapper.BoardMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
@ContextConfiguration(classes = {com.ez.config.RootConfig.class})
public class BoardMapperTests {
	@Setter(onMethod_ = @Autowired)
	private BoardMapper boardMapper;
	
	@Test
	public void testGetList() {
		boardMapper.getList().forEach(board -> log.info(board));
	}
	
	@Test
	public void testInsert() {
		BoardVO boardVO = new BoardVO();
		boardVO.setTITLE("새로 작성하는 글");
		boardVO.setCONTENT("새로 작성하는 내용");
		boardVO.setREG_ID("21모");
		boardVO.setMOD_ID("21모");
		
		boardMapper.insert(boardVO);
		
		log.info(boardVO);
	}
	
	@Test
	public void testInsertSelectKey() {
		BoardVO boardVO = new BoardVO();
		boardVO.setTITLE("새로 작성하는 글 select key");
		boardVO.setCONTENT("새로 작성하는 내용 select key");
		boardVO.setREG_ID("21모");
		boardVO.setMOD_ID("21모");
		
		boardMapper.insertSelectKey(boardVO);
		
		log.info(boardVO);
	}
}
