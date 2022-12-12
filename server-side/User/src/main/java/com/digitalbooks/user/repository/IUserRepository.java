package com.digitalbooks.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digitalbooks.user.entity.User;


public interface IUserRepository extends JpaRepository<User, Long>{

}
