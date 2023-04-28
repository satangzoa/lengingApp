package com.oraclejava.im_lending_app.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("homeLayout");
		mav.addObject("contents", "index :: endGame");
		return mav;
	}
	
	@RequestMapping(value="/403", method=RequestMethod.GET)
	public ModelAndView accessDenied(Principal user) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("403");
		if (user != null) {
			//로그인 완료시
			mav.addObject("msg", 
				user.getName() + "잘못된 경로로 들어오셨습니다!");
		} else {
			mav.addObject("msg", "잘못된 경로로 들어오셨습니다!");
		}
		return mav;
	}
}








