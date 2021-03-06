package com.mycompany.jv30_project_final.entities;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cpu")
public class CPUEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String description;
	
	@Column(name = "cpu_technology")
	private String cpuTechology;
	
	@Column(name = "cpu_speed")
	private String cpuSpeed;
	
	@OneToMany(mappedBy = "cpuEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<ProductEntity> productEntities;

	public CPUEntity() {
		super();
	}

	public CPUEntity(int id, String name, String description, String cpuTechology, String cpuSpeed,
			List<ProductEntity> productEntities) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.cpuTechology = cpuTechology;
		this.cpuSpeed = cpuSpeed;
		this.productEntities = productEntities;
	}

	public CPUEntity(String name, String description, String cpuTechology, String cpuSpeed,
			List<ProductEntity> productEntities) {
		super();
		this.name = name;
		this.description = description;
		this.cpuTechology = cpuTechology;
		this.cpuSpeed = cpuSpeed;
		this.productEntities = productEntities;
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

	public String getCpuTechology() {
		return cpuTechology;
	}

	public void setCpuTechology(String cpuTechology) {
		this.cpuTechology = cpuTechology;
	}

	public String getCpuSpeed() {
		return cpuSpeed;
	}

	public void setCpuSpeed(String cpuSpeed) {
		this.cpuSpeed = cpuSpeed;
	}

	public List<ProductEntity> getProductEntities() {
		return productEntities;
	}

	public void setProductEntities(List<ProductEntity> productEntities) {
		this.productEntities = productEntities;
	}
	
	
	
}
