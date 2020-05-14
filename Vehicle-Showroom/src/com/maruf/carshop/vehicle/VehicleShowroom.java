package com.maruf.carshop.vehicle;

import java.util.ArrayList;

public class VehicleShowroom {
	private int expectedVisitor = 30;
	private String visitorFlag;

	public void expectedVisitor(Vehicle vehicle, String visitorFlag) {
		if (vehicle instanceof SportsVehicle) {
			if (visitorFlag.equals("increase"))
				expectedVisitor = expectedVisitor + 20;
			else
				expectedVisitor = expectedVisitor - 20;
		}

	}

	ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

	public void addVehicle(Vehicle vehicle) {
		vehicleList.add(vehicle);

		visitorFlag = "increase";
		expectedVisitor(vehicle, visitorFlag);
	}

	public void removeVehicle(Vehicle vehicle) {
		vehicleList.remove(vehicle);

		visitorFlag = "decrease";
		expectedVisitor(vehicle, visitorFlag);

	}

	public void vehiclesWithCurrentExpectedVisitor() {
		System.out.println("Current Expected Visitor: " + expectedVisitor);

		System.out.println("List of Vehicles(Models): ");
		for (Vehicle vehicle : vehicleList) {
			System.out.println(vehicle.getModelNumber());
		}

	}

	public void vehiclesDetailsList() {
		System.out.println("Vehicles Details List: ");
		for (Vehicle vehicle : vehicleList) {
			System.out.println(vehicle);
		}

	}

}
