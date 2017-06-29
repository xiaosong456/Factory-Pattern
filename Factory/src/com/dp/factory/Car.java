package com.dp.factory;

public class Car implements Moveable {
	
	private static Car car=new Car();
	
//	private Car(){}//单利模式
	
	public Car(){}
	
	public static Car getInstance(){//静态工厂方法 用于生产car的工厂 但是只能生产一个
		return car;
	}
	
	public void run(){
		System.out.println("冒着烟奔跑中的car....");
	}
}
