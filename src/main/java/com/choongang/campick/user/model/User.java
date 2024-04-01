package com.choongang.campick.user.model;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("cmp_user")
public class User {
	private String user_id;
	private String user_nick;
	private String user_sns;
	private String user_pw;
	private String user_nm;
	private String user_biz;
	private String user_tel;
	private String user_code;
	private String user_addr1;
	private String user_addr2;
	private String user_pic;
	private String user_email;
	private char user_kind;
}
