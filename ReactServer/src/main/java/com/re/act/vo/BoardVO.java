package com.re.act.vo;

import java.sql.Date;

public class BoardVO {

	private Integer seq;
	private String subject;
	private String content;
	private String reg_user;
	private Date reg_date;
	private Integer bHit;
	private String used_yn;
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getReg_user() {
		return reg_user;
	}
	public void setReg_user(String reg_user) {
		this.reg_user = reg_user;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public Integer getbHit() {
		return bHit;
	}
	public void setbHit(Integer bHit) {
		this.bHit = bHit;
	}
	public String getUsed_yn() {
		return used_yn;
	}
	public void setUsed_yn(String used_yn) {
		this.used_yn = used_yn;
	}
	
	
}
