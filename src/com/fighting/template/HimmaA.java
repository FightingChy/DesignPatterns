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
		System.out.println(himmaName + "已签到"); 
	}
	
	
	@Override
	protected void receiveTask(String task) {
		this.task = task;
		System.out.println(himmaName + "接收任务：" + task); 		
	}
	
	protected void doWork() {
		System.out.println(himmaName + "完成任务：" + task); 
		super.setFinish(true);
	}
	
	
}
