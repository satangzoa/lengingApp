package com.oraclejava.im_lending_app.dao;

import org.springframework.data.repository.CrudRepository;

import com.oraclejava.im_lending_app.dto.LendingBook;

public interface LendingBookRepository 
	extends CrudRepository<LendingBook, Integer>{

}
