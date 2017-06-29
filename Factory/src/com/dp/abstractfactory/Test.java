package com.dp.abstractfactory;

public class Test {
	public static void main(String[] args){
		//抽象工厂模式
		
		//每增加一种一个功能时，就需要改动代码
		AbstractFactory f=new DefaultFactory();
		
		Vehicle v=f.createVehicle();
		v.run();
		
		Weapon w=f.createWeapon();
		w.shoot();
		
	}
}
