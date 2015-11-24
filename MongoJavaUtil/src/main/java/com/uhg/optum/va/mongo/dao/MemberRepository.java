package com.uhg.optum.va.mongo.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.uhg.optum.va.mongo.model.Member;

// TODO how to refer specific mongoTemplate for this repository. 
@Repository(value="memberRepository")
public interface MemberRepository extends MongoRepository<Member, String> {
	
	public Member findByMailId(String mailId);
	
	public List<Member> findByFirstName(String firstName);
}
