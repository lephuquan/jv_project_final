package com.mycompany.jv30_project_final.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "image")
public class ImageEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private ProductEntity productEntity;

	public ImageEntity() {
		super();
	}

	public ImageEntity(int id, String name, ProductEntity productEntity) {
		super();
		this.id = id;
		this.name = name;
		this.productEntity = productEntity;
	}

	public ImageEntity(String name, ProductEntity productEntity) {
		super();
		this.name = name;
		this.productEntity = productEntity;
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

	public ProductEntity getProductEntity() {
		return productEntity;
	}

	public void setProductEntity(ProductEntity productEntity) {
		this.productEntity = productEntity;
	}
	
}
