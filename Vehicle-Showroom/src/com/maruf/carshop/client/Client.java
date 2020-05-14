package com.maruf.carshop.client;
import com.maruf.carshop.engine.Engine;
import com.maruf.carshop.vehicle.HeavyVehicle;
import com.maruf.carshop.vehicle.NormalVehicle;
import com.maruf.carshop.vehicle.SportsVehicle;
import com.maruf.carshop.vehicle.VehicleShowroom;

public class Client {
	public static void main(String[] args) {

		VehicleShowroom showroom = new VehicleShowroom();

		Engine gasEngine = new Engine();
		gasEngine.setEngineType("gas");

		Engine oilEngine = new Engine();
		oilEngine.setEngineType("oil");

		Engine dieselEngine = new Engine();
		dieselEngine.setEngineType("diesel");
		

		NormalVehicle normalVehicle = new NormalVehicle();
		normalVehicle.setModelNumber("NORMAL-12121");
		normalVehicle.setEnginePower("2300cc");
		normalVehicle.setTireSize("11.5M");
		normalVehicle.setEngine(gasEngine);

		showroom.addVehicle(normalVehicle);

		SportsVehicle sportsVehicle = new SportsVehicle();
		sportsVehicle.setModelNumber("SPORTS-10101");
		sportsVehicle.setEnginePower("4300cc");
		sportsVehicle.setTireSize("9L");
		sportsVehicle.setEngine(oilEngine);
		sportsVehicle.setTurbo("Turboocharged");

		showroom.addVehicle(sportsVehicle);
		
		SportsVehicle sportsVehicle2 = new SportsVehicle();
		sportsVehicle2.setModelNumber("SPORTS-70777");
		sportsVehicle2.setEnginePower("5300cc");
		sportsVehicle2.setTireSize("10L");
		sportsVehicle2.setEngine(oilEngine);
		sportsVehicle2.setTurbo("Turboocharged-2");

		showroom.addVehicle(sportsVehicle2);
		
		HeavyVehicle heavyVehicle = new HeavyVehicle();
		heavyVehicle.setModelNumber("HEAVY-50105");
		heavyVehicle.setEnginePower("15000cc");
		heavyVehicle.setTireSize("15L");
		heavyVehicle.setEngine(dieselEngine);
		heavyVehicle.setWeight("80ton");

		showroom.addVehicle(heavyVehicle);
		
		showroom.removeVehicle(sportsVehicle2);
        
		showroom.vehiclesWithCurrentExpectedVisitor();
		showroom.vehiclesDetailsList();
		

	}

}
