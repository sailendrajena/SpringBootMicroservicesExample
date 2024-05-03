package com.builder.pattern.example;

public class TestBuilderPatternExample {
	public static void main(String[] args) {
		Computer computerHDDRAM = new Computer.ComputerBuilder("500GB", "2GB").build();
		Computer computerBTGC = new Computer.ComputerBuilder("1TB", "4GB").setGraphicCardEnable(true)
				.setBluetoothEnable(true).build();

		// For only HDD and RAM
		System.out.println("HDD: " + computerHDDRAM.getHDD());
		System.out.println("RAM: " + computerHDDRAM.getRAM());
		
		//For All Configuration
		System.out.println("HDD: "+computerBTGC.getHDD());
		System.out.println("RAM: "+computerBTGC.getRAM());
		System.out.println("Is Graphic Card Enable for this Computer: "+computerBTGC.isGraphicCardEnable());
		System.out.println("Is Bluetooth Enable for this computer: "+computerBTGC.isBluetoothEnable());
	}
}
