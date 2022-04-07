package com.dv.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Emp {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String desg;
	@OneToOne
	private Laptop lap;

	public Emp(int id, String name, String desg, Laptop lap) {
		super();
		this.id = id;
		this.name = name;
		this.desg = desg;
		this.lap = lap;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", desg=" + desg + ", lap=" + lap + "]";
	}

	public Emp() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public Laptop getLap() {
		return lap;
	}

	public void setLap(Laptop lap) {
		this.lap = lap;
	}

}
