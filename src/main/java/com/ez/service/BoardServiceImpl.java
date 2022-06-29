package com.ez.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ez.domain.BoardVO;
import com.ez.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@Log4j
@Service
public class BoardServiceImpl implements BoardService {
	private BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> getList() {
		log.info("BoardService : getList............");
		return boardMapper.getList();
	}
}
