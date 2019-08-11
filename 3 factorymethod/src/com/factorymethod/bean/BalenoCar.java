package com.factorymethod.bean;

public class BalenoCar implements Car {
	@Override
	public void drive() {
		System.out.println("driving :" + this.getClass().getSimpleName());
	}

	@Override
	public void honk() {
		System.out.println("honking : " + this.getClass().getSimpleName());
	}
}