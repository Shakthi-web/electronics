package com.electronics.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mobile_details")
public class Mobile {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String brand;
	private int price;
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", brand=" + brand + ", price=" + price + ", color=" + color + ", ram=" + ram
				+ ", model=" + model + ", rom=" + rom + ", battery=" + battery + ", noOfCam=" + noOfCam + "]";
	}
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(int id, String brand, int price, String color, int ram, String model, int rom, int battery,
			int noOfCam) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.ram = ram;
		this.model = model;
		this.rom = rom;
		this.battery = battery;
		this.noOfCam = noOfCam;
	}
	private String color;
	private int ram;
	private String model;
	private int rom;
	private int battery;
	private int noOfCam;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getRom() {
		return rom;
	}
	public void setRom(int rom) {
		this.rom = rom;
	}
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	public int getNoOfCam() {
		return noOfCam;
	}
	public void setNoOfCam(int noOfCam) {
		this.noOfCam = noOfCam;
	}
	

}
