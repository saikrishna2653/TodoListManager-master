/**
 * 
 */
package com.anup.springboot.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author anup
 *
 */

@Entity
@Table(name="TODO")
public class Todo implements Serializable {

	
	public Todo() {
		super();
	}

	public Todo(Long id, String taskName, String taskDesc, String status) {
		super();
		this.id = id;
		this.taskName = taskName;
		this.taskDesc = taskDesc;
		this.status = status;
	}

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="TASK_NAME")
	private String taskName;
	
	@Column(name="TASK_DESC")
	private String taskDesc;
	
	@Column(name="STATUS")
	private String status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDesc() {
		return taskDesc;
	}

	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
