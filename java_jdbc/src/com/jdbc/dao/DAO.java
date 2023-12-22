package com.jdbc.dao;

import java.util.List;

import com.jdbc.dto.VO;
//						↓ VO를 상속받은 클래스만 가능하다.
public interface DAO<E extends VO> {
//				  ↑ VO를 상속받은 클래스만 가능하다.

	List<E> selectList() throws Exception;
	E selctById(String id)throws Exception;
	void insert(E e)throws Exception;
	void update(E e)throws Exception;
	void delete(String id)throws Exception;
}