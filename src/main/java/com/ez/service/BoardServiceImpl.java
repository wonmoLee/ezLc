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
	
	@Override
	public void registerAction(BoardVO boardVO) {
		log.info("BoardService : registerAction............");
		boardMapper.registerAction(boardVO);
	}
	
	@Override
	public BoardVO get(Long bno) {
		return boardMapper.read(bno);
	}
	
	@Override
	public boolean modifyAction(BoardVO boardVO) {
		log.info("BoardService : modifyAction............");
		
		return boardMapper.modifyAction(boardVO) == 1;
	}
}
