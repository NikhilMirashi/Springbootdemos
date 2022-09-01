package com.vfislk.scope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
@Scope("prototype")
public class Vehicle {

	private String model;
	private String brand;
	private String price;

	public String getModel() {
		return model;
	}

	@Value("${vehicle.model}")
	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	@Value("${vehicle.brand}")
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPrice() {
		return price;
	}

	@Value("${vehicle.price}")
	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", brand=" + brand + ", price=" + price + "]";
	}

}
