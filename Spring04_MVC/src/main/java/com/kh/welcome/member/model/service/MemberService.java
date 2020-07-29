package com.kh.welcome.member.model.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.welcome.member.model.dao.MemberDao;
import com.kh.welcome.member.model.vo.Member;

@Service
//@Service : @Controller 나 @Repository와 달리
//		bean으로 등록시켜주는 기능 외에는 별다른 기능이 없다
//		@Component와 동일, 단 가독성을 위해 @Service 어노테이션을 사용한다.
public class MemberService {
	
	@Autowired
	MemberDao memberDao;

	public int insertMember(Member member) {
		return memberDao.insertMember(member);
	}
	
	public Member selectMember(Map<String , Object> commandMap) {
		return memberDao.selectMember(commandMap);
	}

//------------------회원 수정---------------------------------
	//방법1.
//	public int updateMember(Map<String, Object> commandMap) {
//		return memberDao.updateMember(commandMap);
//	}

	//방법2.
	public int updateMember(Member member) {
		return memberDao.updateMember(member);
	}
//-----------------------------------------------------------------	
	
	
//--------------------회원 탈퇴----------------------------------------	
	//방법1.
//	public int deleteMember(Map<String , Object> commandMap) {
//		return memberDao.deleteMember(commandMap);
//	}
	
	//방법2. update로 회원 탈퇴
	public int updateMemberToLeave(String userId) {
		return memberDao.updateMemberToLeave(userId);
	}
//-----------------------------------------------------------------	
	public int selectId(String userId) {
		return memberDao.selectId(userId);
	}
	
	
}
