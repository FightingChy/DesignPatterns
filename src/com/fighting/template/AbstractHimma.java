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
	 * ǩ��
	 */
	protected abstract void sign();

	/**
	 * ��������
	 * @param task
	 */
	protected abstract void receiveTask(String task);
	
	/**
	 * �ɻ�
	 * @throws Exception 
	 */
	protected  abstract void doWork();
	
	/**
	 * ֧������
	 */
	protected void getMoney() {
		System.out.println("����" + himmaName + "֧����ש���ù�"+ money + "Ԫ");
	}
	
	/**
	 * ����
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
			System.out.println(himmaName + "���̲��ϸ��޷�֧������");
	}

}
