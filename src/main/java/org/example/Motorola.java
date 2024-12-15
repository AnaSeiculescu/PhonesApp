package org.example;

public abstract class Motorola implements Phone{
	private final int batteryLife;
	private final String color;
	private final String material;
	private final String IMEI;

	public Motorola(int batteryLife, String IMEI, String color, String material) {
		this.batteryLife = batteryLife;
		this.IMEI = IMEI;
		this.color = color;
		this.material = material;
	}
}
