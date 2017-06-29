package com.spring.factory;

import java.io.IOException;
import java.util.Properties;

public class Test {
	public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException{
		
		Properties pros=new Properties();
		pros.load(Test.class.getClassLoader().getResourceAsStream("com/spring/factory/spring.properties"));
		String vehicleTypeName=pros.getProperty("VehicleTypeName");
		Object o=Class.forName(vehicleTypeName).newInstance();
		Moveable m=(Moveable)o;
		m.run();
	}
}
