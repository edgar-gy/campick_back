package com.choongang.campick.user.service;

import org.springframework.stereotype.Service;

import com.choongang.campick.user.mapper.UserDAO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	private UserDAO dao;
	
	//test입니다 삭제하고 진행해 주세요
	public void test() {
		dao.test();
	}

}
