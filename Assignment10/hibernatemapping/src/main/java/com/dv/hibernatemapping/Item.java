package com.dv.hibernatemapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Item {
	@Id
	private int id;
	private String category;
	private String prodName;
	private double prize;
	@OneToMany
	private Cart cart;

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Item() {
		super();
	}

	public Item(int id, String category, String prodName, double prize) {
		super();
		this.id = id;
		this.category = category;
		this.prodName = prodName;
		this.prize = prize;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", category=" + category + ", prodName=" + prodName + ", prize=" + prize + "]";
	}

}
