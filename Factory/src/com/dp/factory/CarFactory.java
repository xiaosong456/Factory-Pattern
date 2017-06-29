package com.dp.factory;

public class CarFactory extends VehicleFactory {

	@Override
	public Moveable create() {
		return new Car();
	}
}
