package com.dp.abstractfactory;

public class Test {
	public static void main(String[] args){
		//���󹤳�ģʽ
		
		//ÿ����һ��һ������ʱ������Ҫ�Ķ�����
		AbstractFactory f=new DefaultFactory();
		
		Vehicle v=f.createVehicle();
		v.run();
		
		Weapon w=f.createWeapon();
		w.shoot();
		
	}
}
