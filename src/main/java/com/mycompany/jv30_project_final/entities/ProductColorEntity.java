package com.mycompany.jv30_project_final.entities;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product_color")
public class ProductColorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private double price;
	
	private double quantity;
	
	 @ManyToOne
	 @JoinColumn(name = "product_id")
	 private ProductEntity productEntity;
	 
	 @OneToMany(mappedBy = "productColorEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 private List<ColorEntity>  colorEntities;

	public ProductColorEntity() {
		super();
	}

	public ProductColorEntity(int id, double price, double quantity, ProductEntity productEntity,
			List<ColorEntity> colorEntities) {
		super();
		this.id = id;
		this.price = price;
		this.quantity = quantity;
		this.productEntity = productEntity;
		this.colorEntities = colorEntities;
	}

	public ProductColorEntity(double price, double quantity, ProductEntity productEntity,
			List<ColorEntity> colorEntities) {
		super();
		this.price = price;
		this.quantity = quantity;
		this.productEntity = productEntity;
		this.colorEntities = colorEntities;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public ProductEntity getProductEntity() {
		return productEntity;
	}

	public void setProductEntity(ProductEntity productEntity) {
		this.productEntity = productEntity;
	}

	public List<ColorEntity> getColorEntities() {
		return colorEntities;
	}

	public void setColorEntities(List<ColorEntity> colorEntities) {
		this.colorEntities = colorEntities;
	}
	 
	 
}
