package com.fighting.template;

public class Foreman {
	public static void main(String[] args) {
		AbstractHimma a = new HimmaA("����");
		AbstractHimma b = new HimmaB("����");
		a.setMoney(236.3);
		a.moveBricks("�ϱ߹㳡��ש");

		System.out.println("-----------�ָ���-----------");
		b.setMoney(356.2);
		b.moveBricks("���������һ���ש");

	}
}
