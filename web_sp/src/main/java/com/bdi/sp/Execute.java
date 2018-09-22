package com.bdi.sp;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.bdi.sp.vo.Test;
import com.bdi.sp.vo.Board_info;

public class Execute {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpac;
		cpac = new ClassPathXmlApplicationContext("classpath:spring/application-config.xml");
		SqlSession ss = (SqlSession)cpac.getBean("sst");
		/*Test t = new Test();
		t.setTnum(1);;
		System.out.println(ss.selectOne("TEST.selectTest",t));*/
		System.out.println(ss.selectList("BOARD.selectBoard_info"));
	}
}
