package com.dp.factory;

public class Test {
	public static void main(String[] args){
		/*Car c=Car.getInstance();
		Car c2=Car.getInstance();*/
//		if(c==c2)System.out.println("same car");
		//����ģʽ
		
		//ÿ����һ������Ҫ����һ��factory���ջ���ɹ�������s
		PlaneFactory factory=new PlaneFactory();
		Moveable m=factory.create();
		m.run();
		
		Moveable move=Car.getInstance();
		
		move.run();
	}
}
