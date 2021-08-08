package com.jhta.spring99.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.jhta.spring99.vo.GongiVo;

public class GongiDao {
	private final String NAMESPACE="com.jhta.mybatis.mapper.GongiMapper";
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	public int insert(GongiVo vo) {
		return sqlSession.insert(NAMESPACE+".insert",vo);
	}
	public List<GongiVo> list(HashMap<String,Object> map){
		return sqlSession.selectList(NAMESPACE+".list",map);
	}
	public int getCount(HashMap<String,Object> map) {
		return sqlSession.selectOne(NAMESPACE+".count",map);
	}
	public GongiVo detail(int num) {
		return sqlSession.selectOne(NAMESPACE+".detail", num);
	}
	public GongiVo prev(int num) {
		return sqlSession.selectOne(NAMESPACE+".prev", num);
	}
	public GongiVo next(int num) {
		return sqlSession.selectOne(NAMESPACE+".next", num);
	}
	public int delete(int num) {
		return sqlSession.delete(NAMESPACE+".delete",num);
	}

}
