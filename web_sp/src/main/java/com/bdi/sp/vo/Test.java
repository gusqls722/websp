package com.bdi.sp.vo;

import org.springframework.stereotype.Component;

@Component
public class Test {

	private int tnum;
	private String tname;
	private int tage;
	public Test() {
		
	}

	public int getTnum() {
		return tnum;
	}

	public void setTnum(int tnum) {
		this.tnum = tnum;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public int getTage() {
		return tage;
	}

	public void setTage(int tage) {
		this.tage = tage;
	}

	public Test(int tnum, String tname, int tage) {
		super();
		this.tnum = tnum;
		this.tname = tname;
		this.tage = tage;
	}

	@Override
	public String toString() {
		return "Test [tnum=" + tnum + ", tname=" + tname + ", tage=" + tage + "]";
	}
	
	
}
