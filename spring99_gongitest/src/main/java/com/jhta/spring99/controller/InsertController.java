package com.jhta.spring99.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jhta.spring99.service.GongiService;
import com.jhta.spring99.vo.GongiVo;


@Controller
public class InsertController {
	@Autowired private GongiService service;
	
	@GetMapping("/insert")
	public String insertForm() {
		return "insert";
		
	}
	@PostMapping("/insert")
	public String insert(GongiVo vo,Model model) {
		try {
			service.insert(vo);
			model.addAttribute("code", "successs");
		}catch(Exception e) {
			e.printStackTrace();
			model.addAttribute("code","fail");
		}
		return "result";
	}

}
