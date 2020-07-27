package com.kh.welcome.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kh.welcome.member.model.vo.Member;

@Controller
//Controller 어노테이션으로 해당 객체를 WebApplicationContext에 등록
//  Controller 어노테이션을 등록함으로써 @RequestParam , @RequestMapping
//	같은 Controller를 위한 어노테이션을 사용할 수 있다.

@RequestMapping("member")
public class MemberController {
	
//	방법 1.
	@RequestMapping(value="/login.do")
	public void login() {
		
	}
	
//	//방법 2.
//	@RequestMapping("/login.do")
//	//RequestMapping을 class에 적용하면 해당 클래스의 모든 메소드에 적용되는
//	//url을 지정할수 있다. 이 url 메소드에 붙는 url 앞 경로를 의미한다.
//	public String login() {
//		//String이 반환형이면 String으로 반환되는 문자열이 jsp의 경로가 된다.
//		return "/member/login";
//	}
	
//	//방법 3.
//	@RequestMapping(value="/login.do",method=RequestMethod.GET)
//	//value에 url , method 속성에 허가할 http method 방식 지정
//	public ModelAndView login() {
//		//ModelAndView : model객체에 값을 담고
//		//ViewName을 보내고 싶은 jsp의 경로로 지정
//
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("/member/login");
//		return mav;
//	}

	//-------------------------------------------------------------------------------------------------------------
	
	//방법 1.
//	@RequestMapping(value="/join.do" , method=RequestMethod.GET)
//	//해당 메소드를 어떤 url에 매핑 시킬 지 설정
//	//value 속성에 url을 지정할 수 있다 . 단 지정할 속성이 value밖에 없다면 생략 가능하다.
//	public void join() {
//		//void : 컨트롤러에서 리턴타입이 void라면 요청온 url과 동일한
//		//		 jsp를 찾아서 사용자에게 보내준다.
//	}
	
	//방법 2.
	@RequestMapping("/join.do")
	//RequestMapping을 class에 적용하면 해당 클래스의 모든 메소드에 적용되는
	//url을 지정할수 있다. 이 url 메소드에 붙는 url 앞 경로를 의미한다.
	public String join() {
		//String이 반환형이면 String으로 반환되는 문자열이 jsp의 경로가 된다.
		return "/member/join";
	}
	
	//방법 3.
//	@RequestMapping(value="/join.do",method=RequestMethod.GET)
//	//value에 url , method 속성에 허가할 http method 방식 지정
//	public ModelAndView join() {
//		//ModelAndView : model객체에 값을 담고
//		//ViewName을 보내고 싶은 jsp의 경로로 지정
//
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("/member/join");
//		return mav;
//	}
	
	//------------------------------------------------
	
	@RequestMapping("/joinimpl.do")
	//@RequestParam : http 요청 파라미터를 컨트롤러 메서드의 파라미터로 전달받을 때 사용한다.
	// 타입을 자동으로 변환해준다(매개변수의 타입을 int로 지정했다면 String을 int로 변환해준다)
	// 단 변경이 불가능한 경우에는 400코드를 반환한다.
	public ModelAndView joinImpl(
			
			//방법1
			//@RequestParam Map<String , Object> commandMap
			
			//방법2
			@ModelAttribute Member member
			
			) {
		
		
		ModelAndView mav = new ModelAndView();
		System.out.println(member);
		mav.setViewName("/member/login");
		return mav;
	}
	
	
	
}
