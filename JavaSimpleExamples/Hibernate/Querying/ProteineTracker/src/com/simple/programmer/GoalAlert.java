package com.simple.programmer;

public class GoalAlert {

	private int id;
	private String message;
	
	public GoalAlert(){
		
	}
	
	
	public GoalAlert(String message) {
		super();
		this.message = message;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
