package com.fighting.template;

public class Foreman {
	public static void main(String[] args) {
		AbstractHimma a = new HimmaA("张三");
		AbstractHimma b = new HimmaB("赵四");
		a.setMoney(236.3);
		a.moveBricks("南边广场的砖");

		System.out.println("-----------分割线-----------");
		b.setMoney(356.2);
		b.moveBricks("北边宿舍的一大堆砖");

	}
}
