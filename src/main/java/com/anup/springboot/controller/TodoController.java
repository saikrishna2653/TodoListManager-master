/**
 * 
 */
package com.anup.springboot.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anup.springboot.pojo.Todo;
import com.anup.springboot.service.TodoService;

/**
 * @author anup
 *
 */

@RestController
public class TodoController {

	@Autowired
	TodoService service;
	
	
	@RequestMapping(value = "/todos/addTodo" , method = RequestMethod.POST, headers = "Accept=application/json")
	public Todo addTodo(@RequestBody Todo t) {
		Todo todo = 	service.addTodo(t);
		return todo;
	}
	

	@RequestMapping(value = "/todos/updateTodo" , method = RequestMethod.PUT, headers = "Accept=application/json")
	public Todo updateTodo(@RequestBody Todo t) {
		service.updateTodo(t);
		return t;
	}	
	@RequestMapping(value = "/todos/getAllTodos" , method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Todo> getAllTodos() {
		List<Todo> todoList = service.getAllTodos();
		return todoList;
	}
	
	@RequestMapping(value="/todos/deleteTodo/{id}" , method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteCust(@PathVariable long id) {
		service.deleteTodo(id);
	}
	
}
