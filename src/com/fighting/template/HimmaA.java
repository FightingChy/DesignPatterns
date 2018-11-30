package com.fighting.template;

public class HimmaA extends AbstractHimma {
	
	private String task;
	
	private String himmaName;
	
	public String getHimmaName() {
		return himmaName;
	}

	public void setHimmaName(String himmaName) {
		this.himmaName = himmaName;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public HimmaA(String name) {
		super(name);
		this.himmaName = name;
		// TODO Auto-generated constructor stub
	}
	
	protected void sign() {
		System.out.println(himmaName + "��ǩ��"); 
	}
	
	
	@Override
	protected void receiveTask(String task) {
		this.task = task;
		System.out.println(himmaName + "��������" + task); 		
	}
	
	protected void doWork() {
		System.out.println(himmaName + "�������" + task); 
		super.setFinish(true);
	}
	
	
}
