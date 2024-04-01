package com.choongang.campick.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.choongang.campick.user.service.UserService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class UserController {
	private final UserService service;
	
	//test입	니다 삭제하고 진행하세요
	@GetMapping("test")
	public void test() {
		service.test();
	}
}
