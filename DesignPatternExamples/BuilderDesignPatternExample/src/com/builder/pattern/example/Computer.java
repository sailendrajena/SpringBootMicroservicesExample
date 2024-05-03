package com.builder.pattern.example;

public class Computer {
	// These are required Parameters
	private String HDD;
	private String RAM;

	// These are optional parameter
	private boolean isGraphicCardEnable;
	private boolean isBluetoothEnable;

	public Computer(ComputerBuilder builder) {
		HDD = builder.HDD;
		RAM = builder.RAM;
		this.isGraphicCardEnable = builder.isGraphicCardEnable;
		this.isBluetoothEnable = builder.isBluetoothEnable;
	}

	public String getHDD() {
		return HDD;
	}

	public String getRAM() {
		return RAM;
	}

	public boolean isGraphicCardEnable() {
		return isGraphicCardEnable;
	}

	public boolean isBluetoothEnable() {
		return isBluetoothEnable;
	}
	
	//Builder Class
	public static class ComputerBuilder{
		//Required Parameters
		private String HDD;
		private String RAM;
		
		//Optional Parameters
		private boolean isGraphicCardEnable;
		private boolean isBluetoothEnable;
		
		public ComputerBuilder(String HDD, String RAM) {
			this.HDD = HDD;
			this.RAM = RAM;
		}
		
		public ComputerBuilder setGraphicCardEnable(boolean isGraphicCardEnable) {
			this.isGraphicCardEnable = isGraphicCardEnable;
			return this;
		}
		
		public ComputerBuilder setBluetoothEnable(boolean isBluetoothEnable) {
			this.isBluetoothEnable = isBluetoothEnable;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
	}
}
