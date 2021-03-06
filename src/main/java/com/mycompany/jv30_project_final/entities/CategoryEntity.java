package com.mycompany.jv30_project_final.entities;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class CategoryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String description;
	
	private String status;
	
	 @OneToMany(mappedBy = "categoryEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 private List<ProductEntity> productEntitys;

	public CategoryEntity() {
		super();
	}

	public CategoryEntity(int id, String name, String description, String status, List<ProductEntity> productEntitys) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.status = status;
		this.productEntitys = productEntitys;
	}

	public CategoryEntity(String name, String description, String status, List<ProductEntity> productEntitys) {
		super();
		this.name = name;
		this.description = description;
		this.status = status;
		this.productEntitys = productEntitys;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<ProductEntity> getProductEntitys() {
		return productEntitys;
	}

	public void setProductEntitys(List<ProductEntity> productEntitys) {
		this.productEntitys = productEntitys;
	}
	 
	 
}
