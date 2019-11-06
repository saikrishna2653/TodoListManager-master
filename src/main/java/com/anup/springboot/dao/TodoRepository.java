/**
 * 
 */
package com.anup.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.anup.springboot.pojo.Todo;

/**
 * @author anup
 *
 */
public interface TodoRepository extends CrudRepository<Todo, Long> {

	
	
}
