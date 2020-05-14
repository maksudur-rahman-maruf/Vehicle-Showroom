package com.maruf.carshop.vehicle;

public class HeavyVehicle extends Vehicle {
	String weight;

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "HeavyVehicle [weight=" + weight + ", modelNumber=" + modelNumber + ", enginePower=" + enginePower
				+ ", tireSize=" + tireSize + ", engine=" + engine + "]";
	}

	
	
	

}
