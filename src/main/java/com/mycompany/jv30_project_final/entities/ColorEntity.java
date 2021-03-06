package com.mycompany.jv30_project_final.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "color")
public class ColorEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "Product_color_id")
	private ProductColorEntity productColorEntity;

	public ColorEntity() {
		super();
	}

	public ColorEntity(int id, String name, ProductColorEntity productColorEntity) {
		super();
		this.id = id;
		this.name = name;
		this.productColorEntity = productColorEntity;
	}

	public ColorEntity(String name, ProductColorEntity productColorEntity) {
		super();
		this.name = name;
		this.productColorEntity = productColorEntity;
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

	public ProductColorEntity getProductColorEntity() {
		return productColorEntity;
	}

	public void setProductColorEntity(ProductColorEntity productColorEntity) {
		this.productColorEntity = productColorEntity;
	}
	
	
	
}
