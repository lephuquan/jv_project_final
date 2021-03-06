package com.mycompany.jv30_project_final.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_detail")
public class OrderDetailEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private double price;
	
	private double discount;
	
	private double quantity;
	
	@ManyToOne
	@JoinColumn(name = "product_order_detail_id")
	private ProductEntity productEntity;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private OrderEntity orderEntity;

	public OrderDetailEntity() {
		super();
	}

	public OrderDetailEntity(int id, double price, double discount, double quantity, ProductEntity productEntity,
			OrderEntity orderEntity) {
		super();
		this.id = id;
		this.price = price;
		this.discount = discount;
		this.quantity = quantity;
		this.productEntity = productEntity;
		this.orderEntity = orderEntity;
	}

	public OrderDetailEntity(double price, double discount, double quantity, ProductEntity productEntity,
			OrderEntity orderEntity) {
		super();
		this.price = price;
		this.discount = discount;
		this.quantity = quantity;
		this.productEntity = productEntity;
		this.orderEntity = orderEntity;
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

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
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

	public OrderEntity getOrderEntity() {
		return orderEntity;
	}

	public void setOrderEntity(OrderEntity orderEntity) {
		this.orderEntity = orderEntity;
	}
	
	
}
