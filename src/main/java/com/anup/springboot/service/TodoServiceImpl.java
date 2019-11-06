/**
 * 
 */
package com.anup.springboot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anup.springboot.dao.TodoRepository;
import com.anup.springboot.pojo.Todo;

/**
 * @author anup
 *
 */
@Service("todoService")
public class TodoServiceImpl implements TodoService {

	@Autowired
	TodoRepository dao;
	
	@Override
	@Transactional
	public List<Todo> getAllTodos() {
		// TODO Auto-generated method stub
		
		List<Todo> todoList = new ArrayList<>();
		dao.findAll().forEach(e -> todoList.add(e));
		return todoList;
	}

	@Override
	@Transactional
	public Todo getTodo(Long id) {
		// TODO Auto-generated method stub
		Todo todo = dao.findOne(id);		
		return todo;
	}

	@Override
	@Transactional
	public synchronized Todo addTodo(Todo t) {
		// TODO Auto-generated method stub
		
		dao.save(t);
		return t;
	}

	@Override
	@Transactional
	public Todo updateTodo(Todo t) {
		// TODO Auto-generated method stub
		dao.save(t);
		return t;
	}

	@Override
	@Transactional
	public void deleteTodo(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	
	
	
}
