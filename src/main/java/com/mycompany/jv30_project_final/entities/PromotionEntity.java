package com.mycompany.jv30_project_final.entities;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "promotion")
public class PromotionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String image;
	
	
	@Column(name = "start_date")
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	private double discount;
	
	private String description;
	
	 @ManyToMany(cascade = {CascadeType.PERSIST,
		        CascadeType.MERGE}, fetch = FetchType.LAZY)
		    @JoinTable(name = "prod_prom_relationship",
		            joinColumns = @JoinColumn(name = "prom_id",
		                    referencedColumnName = "id"),
		            inverseJoinColumns = @JoinColumn(
		                    name = "prod_id",
		                    referencedColumnName = "id"))
	 private List<ProductEntity> productEntities;

	public PromotionEntity() {
		super();
	}

	public PromotionEntity(int id, String name, String image, Date startDate, Date endDate, double discount,
			String description, List<ProductEntity> productEntities) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.startDate = startDate;
		this.endDate = endDate;
		this.discount = discount;
		this.description = description;
		this.productEntities = productEntities;
	}

	public PromotionEntity(String name, String image, Date startDate, Date endDate, double discount, String description,
			List<ProductEntity> productEntities) {
		super();
		this.name = name;
		this.image = image;
		this.startDate = startDate;
		this.endDate = endDate;
		this.discount = discount;
		this.description = description;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<ProductEntity> getProductEntities() {
		return productEntities;
	}

	public void setProductEntities(List<ProductEntity> productEntities) {
		this.productEntities = productEntities;
	}
	 
	 
}
