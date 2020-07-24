package com.kh.welcome.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//Controller 어노테이션으로 해당 객체를 WebApplicationContext에 등록
//  Controller 어노테이션을 등록함으로써 @RequestParam , @RequestMapping
//	같은 Controller를 위한 어노테이션을 사용할 수 있다.
public class MemberController {

	@RequestMapping(value="/join.do" , method=RequestMethod.GET)
	public void join() {
		
	}
	
	
}
