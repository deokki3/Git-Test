package com.jhta.spring99.service;

import java.util.HashMap;
import java.util.List;

import com.jhta.mybatis.mapper.GongiMapper;
import com.jhta.spring99.vo.GongiVo;

public class GongiService {

	private GongiMapper dao;
	public void setDao(GongiMapper dao) {
	
	
		this.dao = dao;
	}
	public int insert(GongiVo vo) {
		return dao.insert(vo);
	}
	public List<GongiVo> list(HashMap<String,Object> map){
		return dao.list(map);
	}
	public int getCount(HashMap<String,Object> map) {

		return dao.count(map);
	}
	
	public GongiVo detail(int num) {
		return dao.detail(num);
	}
	public GongiVo prev(int num) {
		return dao.prev(num);
	}
	public GongiVo next(int num) {
		return dao.next(num);
	}
	public int delete(int num) {
		return dao.delete(num);
	}

}
