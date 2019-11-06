/**
 * 
 */
package com.anup.springboot.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.anup.springboot.pojo.Todo;


/**
 * @author anup
 *
 */

@Repository("todoDao")
public class TodoDaoImpl implements TodoDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addTodo(Todo c) {
	
		Session session = sessionFactory.getCurrentSession();
		
		session.save(c);
		
		
	}

	@Override
	public List<Todo> getTodos() {
		
		Session session = sessionFactory.getCurrentSession();
		
		List<Todo> list =  session.createQuery("from Todo").list();
		
		return list;
	}

	@Override
	public void deleteTodo(int id) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.getCurrentSession();
		
		Todo c = session.load(Todo.class, new Integer(id));
		
		if(c!= null)
		session.delete(c);
		
	}

	@Override
	public void updateTodo(Todo c) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.getCurrentSession();
		
		session.update(c);
		
	}

	@Override
	public Todo getTodo(int id) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.getCurrentSession();
		
		Todo c = (Todo)session.get(Todo.class, id);
		
		return c;
	}
	
	
	
	
	
	
}
