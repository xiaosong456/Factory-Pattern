package com.dp.abstractfactory;

public class DefaultFactory extends AbstractFactory  {
	
	@Override
	public Vehicle createVehicle() {
		return new Car();
	}

	@Override
	public Weapon createWeapon() {
		return new AK47();
	}
	
}
