package com.techendear.builder;

public class Vehical {

	private String engine;
	private int wheel;
	
	private int airbags;

	public String getEngine() {
		return engine;
	}

	public int getWheel() {
		return wheel;
	}

	
	public int getAirbags() {
		return airbags;
	}

	public void setAirbags(int airbags) {
		this.airbags = airbags;
	}

	
	private Vehical(VehicleBuilder builder) {
		
		this.engine = builder.engine;
		this.wheel = builder.wheels;
		this.airbags = builder.airbags;
		
	}

	public static class VehicleBuilder{
		
		private String engine;
		private int wheels;
		private int airbags;
		
		public VehicleBuilder(String engine, int wheels) {
			this.engine = engine;
			this.wheels = wheels;
		}

		public VehicleBuilder setAirbags(int airbags) {
			this.airbags = airbags;
			return this;
		}
		
		public Vehical build() {
			return new Vehical(this);
		}
	}
}
