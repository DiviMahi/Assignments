package com.dv.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	@Id
	private int id;

	public Emp getEmployee() {
		return employee;
	}

	public void setEmployee(Emp employee) {
		this.employee = employee;
	}

	private String brand;
	@OneToOne(mappedBy = "lap")
	private Emp employee;

	public Laptop(int id, String brand) {
		super();
		this.id = id;
		this.brand = brand;
	}

	public Laptop() {
		super();
	}

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

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", brand=" + brand + ", employee=" + employee + "]";
	}

}
