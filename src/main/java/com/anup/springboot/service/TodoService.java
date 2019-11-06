/**
 * 
 */
package com.anup.springboot.service;

import java.util.List;

import com.anup.springboot.pojo.Todo;

/**
 * @author anup
 *
 */

public interface TodoService {
	
	
	public List<Todo> getAllTodos();
	public Todo getTodo(Long id);
	public Todo addTodo(Todo t);
	public Todo updateTodo(Todo t);
	public void deleteTodo(Long id);
	
	//@Autowired
	//TodoDaoImpl todoDao; 
	
	/*@Autowired
	TodoRepository todoDao;
	
	@Transactional
	public void addTodo(Todo t) {
		
		todoDao.save(t);
	}
	
	@Transactional
	public Iterable<Todo> getTodoList() {
		
		
		
		return todoDao.findAll();
		 
	}
	
	
	@Transactional
	public List<Todo> getTodos() {
		
		return todoDao.getTodos();
	}
	
	@Transactional
	public void addTodo(Todo cust) {
		
		todoDao.addTodo(cust);
	}
	
	@Transactional
	public void deleteTodo(int id) {
		
		todoDao.deleteTodo(id);
	}
	
	@Transactional
	public Todo getTodo(int id) {
		
		return todoDao.getTodo(id);
	}
	
	@Transactional
	public void updateTodo(Todo c) {
		
		todoDao.updateTodo(c);
		
	}*/
}
