package com.dp.factory;

public class Test {
	public static void main(String[] args){
		/*Car c=Car.getInstance();
		Car c2=Car.getInstance();*/
//		if(c==c2)System.out.println("same car");
		//工厂模式
		
		//每增加一种类别就要增加一个factory最终会造成工厂泛滥s
		PlaneFactory factory=new PlaneFactory();
		Moveable m=factory.create();
		m.run();
		
		Moveable move=Car.getInstance();
		
		move.run();
	}
}
