package com.dp.factory;

public class Car implements Moveable {
	
	private static Car car=new Car();
	
//	private Car(){}//����ģʽ
	
	public Car(){}
	
	public static Car getInstance(){//��̬�������� ��������car�Ĺ��� ����ֻ������һ��
		return car;
	}
	
	public void run(){
		System.out.println("ð���̱����е�car....");
	}
}
