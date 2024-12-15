package org.example;

public abstract class Motorola implements Phone{
	private final String batteryLife;
	private String color;
	private String material;
	private final String IMEI;

	public Motorola(String batteryLife, String IMEI, String color, String material) {
		this.batteryLife = batteryLife;
		this.IMEI = IMEI;
		this.color = color;
		this.material = material;
	}
}
