package com.zhuzhiguang.goods;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootStart {
	
	private static Logger log = Logger.getLogger(BootStart.class);
	
	public static void main(String[] args) {
		log.info(" �̼ҵĿͷ���ʼ�����ˡ�����");
		new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		log.info(" �̼ҵĿͷ����Ѿ������ɹ���������");
		try {
			System.in.read();
		}catch (IOException e) {
			
		}
	}

}
