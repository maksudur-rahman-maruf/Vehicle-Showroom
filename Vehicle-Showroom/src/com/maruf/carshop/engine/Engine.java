package com.maruf.carshop.engine;

public class Engine {
	String engineType;

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + "]";
	}

}
