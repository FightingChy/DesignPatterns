package com.fighting.template;

public abstract class AbstractHimma implements Himma {
		
	private boolean isFinish;
	
	private double money;
	
	private String himmaName;

	protected void setFinish(boolean isFinish) {
		this.isFinish = isFinish;
	}

	protected void setMoney(double money) {
		this.money = money;
	}
	
	public AbstractHimma(String name) {
		this.himmaName = name;
	}
	
	/**
	 * 签到
	 */
	protected abstract void sign();

	/**
	 * 接收任务
	 * @param task
	 */
	protected abstract void receiveTask(String task);
	
	/**
	 * 干活
	 * @throws Exception 
	 */
	protected  abstract void doWork();
	
	/**
	 * 支付工资
	 */
	protected void getMoney() {
		System.out.println("已向" + himmaName + "支付搬砖费用共"+ money + "元");
	}
	
	/**
	 * 验收
	 * @return
	 */
	private boolean check() {
		return isFinish;
	}
	
	public final void moveBricks(String task) {
		sign();
		receiveTask(task);
		doWork();
		if(check())
			getMoney();
		else
			System.out.println(himmaName + "工程不合格无法支付工资");
	}

}
