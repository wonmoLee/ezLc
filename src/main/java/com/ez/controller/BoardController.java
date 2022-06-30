package com.ez.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ez.domain.BoardVO;
import com.ez.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@Log4j
@Controller
@RequestMapping("/board")
public class BoardController {
	private BoardService boardService;
	
	@GetMapping("")
	public String list (Model model) {
		log.info("BoardController: getList.............");
		
		model.addAttribute("list", boardService.getList());
		
		return "/user/board/list";
	}
	
	@GetMapping("/register")
	public String register (Model model) {
		log.info("BoardController: register.............");
		
		return "/user/board/register";
	}
	
	@PostMapping("/registerAction")
	public String registerAction(BoardVO boardVO, RedirectAttributes rttr) {
		log.info("글등록 완료: " + boardVO);
		
		boardService.registerAction(boardVO);
		
		rttr.addFlashAttribute("result", boardVO.getBNO());
		
		return "redirect:/board";
	}
}
