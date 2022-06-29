package com.ez.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ez.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@Log4j
@Controller
@RequestMapping("/board/*")
public class BoardController {
	private BoardService boardService;
	
	@GetMapping("")
	public String list (Model model) {
		log.info("BoardController: getList.............");
		
		model.addAttribute("list", boardService.getList());
		
		return "/user/board";
	}
}
