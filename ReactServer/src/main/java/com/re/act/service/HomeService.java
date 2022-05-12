package com.re.act.service;

import java.util.List;

import com.re.act.vo.BoardVO;

public interface HomeService {

	void write(BoardVO params);

	List<BoardVO> listCall();

	BoardVO detail(Integer seq);

}
