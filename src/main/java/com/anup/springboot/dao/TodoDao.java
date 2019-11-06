/**
 * 
 */
package com.anup.springboot.dao;

import java.util.List;

import com.anup.springboot.pojo.Todo;


/**
 * @author anup
 *
 */
public interface TodoDao {

	
	public void addTodo(Todo c);
	public List<Todo> getTodos();
	public void deleteTodo(int id);
	public void updateTodo(Todo c);
	public Todo getTodo(int id);
}
