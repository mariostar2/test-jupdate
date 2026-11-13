package com.green.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.green.study.entity.MyUser;

public interface MyUserRepoitory extends JpaRepository<MyUser, Integer> {

}
