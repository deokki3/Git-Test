package com.jhta.spring99.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jhta.spring99.service.GongiService;
import com.jhta.spring99.vo.GongiVo;


@Controller
public class DetailController {
	@Autowired private GongiService service;
	
	
	@GetMapping("detail")
	public String detail(int num,Model model) {
		GongiVo vo=service.detail(num);
		GongiVo prev=service.prev(num);
		GongiVo next=service.next(num);
		model.addAttribute("vo", vo);
		model.addAttribute("prev", prev);
		model.addAttribute("next", next);
		return "detail";
		
		
		
	}
}
