package com.green.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.study.dto.MyUserDto;
import com.green.study.entity.MyUser;
import com.green.study.repository.MyUserRepoitory;

@Service
public class MyUserService {
	

	private final MyUserRepoitory myUserRepoitory;
	
	MyUserService(MyUserRepoitory myUserRepoitory){
		this.myUserRepoitory = myUserRepoitory;
	}
	
	public int regist(MyUserDto dto) {
		//MyUser --> entity
		MyUser entity =new MyUser();
		
		entity.setUserid(dto.getUserid());
		entity.setUsername(dto.getUsername());
		
		MyUser result = myUserRepoitory.save(entity);
		
		return result.getId();
	}
	
	
	
}
