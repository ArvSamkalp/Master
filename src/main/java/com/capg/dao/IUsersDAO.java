package com.capg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.entities.Users;

@Repository
public interface IUsersDAO extends JpaRepository<Users,Integer>{

}
