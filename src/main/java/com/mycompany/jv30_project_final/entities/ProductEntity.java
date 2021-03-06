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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "product")
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String status;
	
	@Column(name = "support_maximun_ram")
	private String supportMaximunRam;
	
	@Column(name = "hard_driver")
	private String hardDriver;
	
	@Column(name = "screen_size")
	private String screenSize;
	
	private String resolution;
	
	private String brand;
	
	@Column(name = "proteted_time")
	private String protetedTime;
	
	private double price;
	
	
	@Column(name = "day_of_sale")
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date DayOfSale;
	
	 @ManyToOne
	 @JoinColumn(name = "category_id")
	 private CategoryEntity categoryEntity;
	 
	 @ManyToMany(mappedBy = "productEntities")
	 private List<PromotionEntity> promotionEntities;
	 
	 @OneToMany(mappedBy = "productEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 private List<ImageEntity> imageEntities;

	 @ManyToOne
	 @JoinColumn(name = "cpu_id")
	 private CPUEntity cpuEntity;
	 
	 @ManyToOne
	 @JoinColumn(name = "ram_id")
	 private RamEntity ramEntity;
	 
	 @OneToMany(mappedBy = "productEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 private List<ProductColorEntity>  productColorEntities;
	 
	 @OneToMany(mappedBy = "productEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 private List<CommentEntity> commentEntities;
	 
	 @OneToMany(mappedBy = "productEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 private List<VoteEntity> voteEntities;
	 
	 @OneToMany(mappedBy = "productEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 private List<OrderDetailEntity> orderDetailEntities;

	public ProductEntity() {
		super();
	}

	public ProductEntity(int id, String name, String status, String supportMaximunRam, String hardDriver,
			String screenSize, String resolution, String brand, String protetedTime, double price, Date dayOfSale,
			CategoryEntity categoryEntity, List<PromotionEntity> promotionEntities, List<ImageEntity> imageEntities,
			CPUEntity cpuEntity, RamEntity ramEntity, List<ProductColorEntity> productColorEntities,
			List<CommentEntity> commentEntities, List<VoteEntity> voteEntities,
			List<OrderDetailEntity> orderDetailEntities) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.supportMaximunRam = supportMaximunRam;
		this.hardDriver = hardDriver;
		this.screenSize = screenSize;
		this.resolution = resolution;
		this.brand = brand;
		this.protetedTime = protetedTime;
		this.price = price;
		DayOfSale = dayOfSale;
		this.categoryEntity = categoryEntity;
		this.promotionEntities = promotionEntities;
		this.imageEntities = imageEntities;
		this.cpuEntity = cpuEntity;
		this.ramEntity = ramEntity;
		this.productColorEntities = productColorEntities;
		this.commentEntities = commentEntities;
		this.voteEntities = voteEntities;
		this.orderDetailEntities = orderDetailEntities;
	}

	public ProductEntity(String name, String status, String supportMaximunRam, String hardDriver, String screenSize,
			String resolution, String brand, String protetedTime, double price, Date dayOfSale,
			CategoryEntity categoryEntity, List<PromotionEntity> promotionEntities, List<ImageEntity> imageEntities,
			CPUEntity cpuEntity, RamEntity ramEntity, List<ProductColorEntity> productColorEntities,
			List<CommentEntity> commentEntities, List<VoteEntity> voteEntities,
			List<OrderDetailEntity> orderDetailEntities) {
		super();
		this.name = name;
		this.status = status;
		this.supportMaximunRam = supportMaximunRam;
		this.hardDriver = hardDriver;
		this.screenSize = screenSize;
		this.resolution = resolution;
		this.brand = brand;
		this.protetedTime = protetedTime;
		this.price = price;
		DayOfSale = dayOfSale;
		this.categoryEntity = categoryEntity;
		this.promotionEntities = promotionEntities;
		this.imageEntities = imageEntities;
		this.cpuEntity = cpuEntity;
		this.ramEntity = ramEntity;
		this.productColorEntities = productColorEntities;
		this.commentEntities = commentEntities;
		this.voteEntities = voteEntities;
		this.orderDetailEntities = orderDetailEntities;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSupportMaximunRam() {
		return supportMaximunRam;
	}

	public void setSupportMaximunRam(String supportMaximunRam) {
		this.supportMaximunRam = supportMaximunRam;
	}

	public String getHardDriver() {
		return hardDriver;
	}

	public void setHardDriver(String hardDriver) {
		this.hardDriver = hardDriver;
	}

	public String getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getProtetedTime() {
		return protetedTime;
	}

	public void setProtetedTime(String protetedTime) {
		this.protetedTime = protetedTime;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getDayOfSale() {
		return DayOfSale;
	}

	public void setDayOfSale(Date dayOfSale) {
		DayOfSale = dayOfSale;
	}

	public CategoryEntity getCategoryEntity() {
		return categoryEntity;
	}

	public void setCategoryEntity(CategoryEntity categoryEntity) {
		this.categoryEntity = categoryEntity;
	}

	public List<PromotionEntity> getPromotionEntities() {
		return promotionEntities;
	}

	public void setPromotionEntities(List<PromotionEntity> promotionEntities) {
		this.promotionEntities = promotionEntities;
	}

	public List<ImageEntity> getImageEntities() {
		return imageEntities;
	}

	public void setImageEntities(List<ImageEntity> imageEntities) {
		this.imageEntities = imageEntities;
	}

	public CPUEntity getCpuEntity() {
		return cpuEntity;
	}

	public void setCpuEntity(CPUEntity cpuEntity) {
		this.cpuEntity = cpuEntity;
	}

	public RamEntity getRamEntity() {
		return ramEntity;
	}

	public void setRamEntity(RamEntity ramEntity) {
		this.ramEntity = ramEntity;
	}

	public List<ProductColorEntity> getProductColorEntities() {
		return productColorEntities;
	}

	public void setProductColorEntities(List<ProductColorEntity> productColorEntities) {
		this.productColorEntities = productColorEntities;
	}

	public List<CommentEntity> getCommentEntities() {
		return commentEntities;
	}

	public void setCommentEntities(List<CommentEntity> commentEntities) {
		this.commentEntities = commentEntities;
	}

	public List<VoteEntity> getVoteEntities() {
		return voteEntities;
	}

	public void setVoteEntities(List<VoteEntity> voteEntities) {
		this.voteEntities = voteEntities;
	}

	public List<OrderDetailEntity> getOrderDetailEntities() {
		return orderDetailEntities;
	}

	public void setOrderDetailEntities(List<OrderDetailEntity> orderDetailEntities) {
		this.orderDetailEntities = orderDetailEntities;
	}
	 
	 
}
