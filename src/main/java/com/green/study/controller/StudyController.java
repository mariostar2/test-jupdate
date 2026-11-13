package com.green.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.green.study.dto.MyUserDto;
import com.green.study.service.MyUserService;

@Controller
public class StudyController {
	
	@Autowired
	private MyUserService myUserService;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("msg" , "hello~~");
		return "index";
	}
	
	@RequestMapping("/regform")
	public String regform() {
		return "regform";
	}
	
	@PostMapping("/regist")
	public String regist(Model model,MyUserDto dto) {
		int result = myUserService.regist(dto);
		String message  = "";
		if(result >0) {
			message="등록 성공~";
		}else {
			message = "등록 실패~";
		}
		
		model.addAttribute("Message", message);
		return "result";
		
	}
	
	
}
