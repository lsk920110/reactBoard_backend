package com.re.act.controller;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.re.act.service.HomeService;
import com.re.act.service.HomeServiceImpl;
import com.re.act.vo.BoardVO;
import com.re.act.vo.ResultVO;


@RestController
public class HomeController {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired HomeService homeService;
	
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {
		System.out.println("asd");
		
		return "home";
	}
	
	
	
	@RequestMapping(value="/hashmap")
	public HashMap<String, Object> hashmap(){
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("key", "value");
		return map;
	}
	
	
	@RequestMapping(value="/vo")
	public ResultVO vo () {
		ResultVO vo = new ResultVO();
		vo.setCode("cccc");
		vo.setMessage("1234");
		
		
		return vo;
		
	}
	
	@RequestMapping(value="/write", method = RequestMethod.POST)
	public ResultVO write(@RequestBody BoardVO params) {
		
		System.out.println("도착");
		logger.info("params : {}",params);
		homeService.write(params);
		
		
		ResultVO rv = new ResultVO();
		
		
		return rv;
	}
	
	@RequestMapping(value="/listCall", method = RequestMethod.GET)
	public List<BoardVO> listCall(){
		logger.info("listCall");
		List<BoardVO> lbv = homeService.listCall();
		
		return lbv;
	}
	
	@RequestMapping(value="/detail/{seq}")
	public BoardVO detail(@PathVariable Integer seq) {
		logger.info("detail : {}",seq);
		BoardVO bv = homeService.detail(seq);
		
		logger.info("bv : {}",bv);
		return bv;
	}
	
	
	
}
