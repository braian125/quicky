package com.quicky.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
  private String description;
  
  @Column(name = "price")
	private double price;

	@Column(name = "published")
	private boolean published;

	public Product() {

	}

	public Product(String title, String description, double price, boolean published) {
		this.title = title;
    this.description = description;
    this.price = price;
		this.published = published;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}
  
	public void setDescription(String description) {
    this.description = description;
	}
  
  public void setPrice(double price) {
    this.price = price;
  }
  
  public double getPrice() {
    return price;
  }

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean isPublished) {
		this.published = isPublished;
	}

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", price=" + price + ", published=" + published + "]";
	}

}
