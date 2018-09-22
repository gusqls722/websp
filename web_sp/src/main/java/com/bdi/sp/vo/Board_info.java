package com.bdi.sp.vo;

import org.springframework.stereotype.Component;

@Component
public class Board_info {

	private int binum;
	private String bititle;
	private String bitext;
	private String biFile;
	private String bicredat;
	private String bimoddat;
	private int bicnt;
	private int biactive;
	private int uinum;
	public Board_info() {
		
	}
	@Override
	public String toString() {
		return "board_info [binum=" + binum + ", bititle=" + bititle + ", bitext=" + bitext + ", biFile=" + biFile
				+ ", bicredat=" + bicredat + ", bimoddat=" + bimoddat + ", bicnt=" + bicnt + ", biactive=" + biactive
				+ ", uinum=" + uinum + "]";
	}

	public Board_info(int binum, String bititle, String bitext, String biFile, String bicredat, String bimoddat,
			int bicnt, int biactive, int uinum) {
		super();
		this.binum = binum;
		this.bititle = bititle;
		this.bitext = bitext;
		this.biFile = biFile;
		this.bicredat = bicredat;
		this.bimoddat = bimoddat;
		this.bicnt = bicnt;
		this.biactive = biactive;
		this.uinum = uinum;
	}

	public int getBinum() {
		return binum;
	}
	public void setBinum(int binum) {
		this.binum = binum;
	}
	public String getBititle() {
		return bititle;
	}
	public void setBititle(String bititle) {
		this.bititle = bititle;
	}
	public String getBitext() {
		return bitext;
	}
	public void setBitext(String bitext) {
		this.bitext = bitext;
	}
	public String getBiFile() {
		return biFile;
	}
	public void setBiFile(String biFile) {
		this.biFile = biFile;
	}
	public String getBicredat() {
		return bicredat;
	}
	public void setBicredat(String bicredat) {
		this.bicredat = bicredat;
	}
	public String getBimoddat() {
		return bimoddat;
	}
	public void setBimoddat(String bimoddat) {
		this.bimoddat = bimoddat;
	}
	public int getBicnt() {
		return bicnt;
	}
	public void setBicnt(int bicnt) {
		this.bicnt = bicnt;
	}
	public int getBiactive() {
		return biactive;
	}
	public void setBiactive(int biactive) {
		this.biactive = biactive;
	}
	public int getUinum() {
		return uinum;
	}
	public void setUinum(int uinum) {
		this.uinum = uinum;
	}
	
}
