package com.re.act.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.re.act.dao.HomeDAO;
import com.re.act.vo.BoardVO;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired HomeDAO homeDAO;

	@Override
	public void write(BoardVO params) {
		homeDAO.write(params);
		
	}

	@Override
	public List<BoardVO> listCall() {
		return homeDAO.listCall();
	}

	@Override
	public BoardVO detail(Integer seq) {
		return homeDAO.detail(seq);
	}
	

}
