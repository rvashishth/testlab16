package com.uhg.optum.va.mongo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uhg.optum.va.mongo.model.Member;

@Service("memberMongoService")
public class MemberMongoService {

	@Autowired
	private MemberRepository memberRepository;
	
	public void saveMember(Member member){
		memberRepository.insert(member);
	}
	
	public Member findByMailId(String mailId){
		return memberRepository.findByMailId(mailId);
	}
	
	public List<Member> findByFirstName(String firstName){
		return memberRepository.findByFirstName(firstName);
	}
}
