package com.maruf.carshop.vehicle;

public class SportsVehicle extends Vehicle {
	String turbo;

	public String getTurbo() {
		return turbo;
	}

	public void setTurbo(String turbo) {
		this.turbo = turbo;
	}

	@Override
	public String toString() {
		return "SportsVehicle [turbo=" + turbo + ", modelNumber=" + modelNumber + ", enginePower=" + enginePower
				+ ", tireSize=" + tireSize + ", engine=" + engine + "]";
	}

	

}
