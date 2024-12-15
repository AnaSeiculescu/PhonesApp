package org.example;

public abstract class Samsung implements Phone{
	private final String batteryLife;
	private String color;
	private String material;
	private final String IMEI;

	public Samsung(String batteryLife, String IMEI, String color, String material) {
		this.batteryLife = batteryLife;
		this.IMEI = IMEI;
		this.color = color;
		this.material = material;
	}
}
