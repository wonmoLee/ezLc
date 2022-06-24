package com.ez.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ez.domain.BoardVO;

public interface BoardMapper {
	public List<BoardVO> getList();
}
