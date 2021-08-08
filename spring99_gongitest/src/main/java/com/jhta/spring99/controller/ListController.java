package com.jhta.spring99.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jhta.spring99.service.GongiService;
import com.jhta.spring99.vo.GongiVo;
import com.jhta.util.PageUtil;

@Controller
public class ListController {
	@Autowired private GongiService service;
	
	@RequestMapping("/list")
	public ModelAndView list(@RequestParam(value="pageNum",defaultValue="1")int pageNum,String field,String keyword) {
		HashMap<String,Object> map=new HashMap<String,Object>();
		map.put("field",field);
		map.put("keyword",keyword);
		
		int totalRowCount=service.getCount(map);//전체 글의 갯수
		PageUtil pu=new PageUtil(pageNum,5, 5, totalRowCount); //한 페이지글의 개수 5개 , 페이지 처리된 개수 5개 
		System.out.println(pu);
		int startRow=pu.getStartRow();
		int endRow=pu.getEndRow();	
		System.out.println(pu.isNextPage());

	


		map.put("startRow",startRow);
		map.put("endRow",endRow);
		List<GongiVo> list=service.list(map);	
	
		ModelAndView mv=new ModelAndView("list");
		mv.addObject("list",list);
		mv.addObject("pu",pu);	
		mv.addObject("field",field);
		mv.addObject("keyword",keyword);
		return mv;
	}
}
