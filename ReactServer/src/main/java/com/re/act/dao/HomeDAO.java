package com.re.act.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.re.act.vo.BoardVO;

@Repository
public interface HomeDAO {

	void write(BoardVO params);

	List<BoardVO> listCall();

	BoardVO detail(Integer seq);

}
