package com.jhta.mybatis.mapper;

import java.util.HashMap;
import java.util.List;

import com.jhta.spring99.vo.GongiVo;
 /*
  * 매퍼인터페이스 만들기
  * - Mapper XML 파일과 동일한 이름의 패키지와 인터페이스명으로 만들기
  * - Mapper XML 파일과 SQL구문 id속성과 동일한 이름으로 메소드 만들기
  */
public interface GongiMapper {

	int insert(GongiVo vo);
	int delete(int num);
	int count(HashMap<String,Object> map);
	List<GongiVo> list(HashMap<String,Object> map);
	GongiVo detail(int num);
	GongiVo next(int num);
	GongiVo prev(int num);
}
