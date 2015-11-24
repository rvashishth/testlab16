package com.uhg.optum.va.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uhg.optum.va.mongo.dao.MemberMongoService;
import com.uhg.optum.va.mongo.model.Member;

public class MongoApp {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/ugh/optum/va/config/Spring-Config.xml");
		System.out.println(applicationContext);
		
		Member member  = new Member();
		member.setFirstName("Rahul");
		member.setLastName("Vashishth");
		member.setMailId("rvashishth@optum.com");
		
//		Member member2 = new Member();
//		member2.setFirstName("Rahul");
//		member2.setLastName("Sharma");
//		member2.setMailId("rsharma@optum.com");
		
		MemberMongoService memberMongoService =  applicationContext.getBean("memberMongoService",MemberMongoService.class);
//		memberMongoService.saveMember(member2);
		memberMongoService.saveMember(member);
		System.out.println("Saved");
		
	}
}
