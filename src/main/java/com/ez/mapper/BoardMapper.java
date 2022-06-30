package com.ez.mapper;

import java.util.List;

import com.ez.domain.BoardVO;

public interface BoardMapper {
	public List<BoardVO> getList();
	
	public void registerAction(BoardVO boardVO);
	
	public void insertSelectKey(BoardVO boardVO);
}
