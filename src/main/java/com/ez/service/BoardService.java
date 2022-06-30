package com.ez.service;

import java.util.List;

import com.ez.domain.BoardVO;

public interface BoardService {
	public List<BoardVO> getList();
	
	public void registerAction(BoardVO boardVO);
}
