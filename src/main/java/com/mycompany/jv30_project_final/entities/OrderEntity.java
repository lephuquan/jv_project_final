package com.mycompany.jv30_project_final.entities;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.mycompany.jv30_project_final.enums.OrderStatus;

@Entity
@Table(name = "order_entity")
public class OrderEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "date_of_purchase")
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateOfPurchse;
	
	private double total;
	
	private String status;
	
	 @ManyToOne
	 @JoinColumn(name = "account_order_id")
	 private AccountEntity accountEntity;
	 
	 @OneToMany(mappedBy = "productEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 private List<OrderDetailEntity> orderDetailEntities;
	 
	 @OneToMany(mappedBy = "orderEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 private List<PaymentEntity> paymentEntities;
	 
	 @Enumerated(EnumType.STRING)
	 private OrderStatus role = OrderStatus.COMFIRM;

	public OrderEntity() {
		super();
	}

	public OrderEntity(int id, Date dateOfPurchse, double total, String status, AccountEntity accountEntity,
			List<OrderDetailEntity> orderDetailEntities, List<PaymentEntity> paymentEntities, OrderStatus role) {
		super();
		this.id = id;
		this.dateOfPurchse = dateOfPurchse;
		this.total = total;
		this.status = status;
		this.accountEntity = accountEntity;
		this.orderDetailEntities = orderDetailEntities;
		this.paymentEntities = paymentEntities;
		this.role = role;
	}

	public OrderEntity(Date dateOfPurchse, double total, String status, AccountEntity accountEntity,
			List<OrderDetailEntity> orderDetailEntities, List<PaymentEntity> paymentEntities, OrderStatus role) {
		super();
		this.dateOfPurchse = dateOfPurchse;
		this.total = total;
		this.status = status;
		this.accountEntity = accountEntity;
		this.orderDetailEntities = orderDetailEntities;
		this.paymentEntities = paymentEntities;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateOfPurchse() {
		return dateOfPurchse;
	}

	public void setDateOfPurchse(Date dateOfPurchse) {
		this.dateOfPurchse = dateOfPurchse;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public AccountEntity getAccountEntity() {
		return accountEntity;
	}

	public void setAccountEntity(AccountEntity accountEntity) {
		this.accountEntity = accountEntity;
	}

	public List<OrderDetailEntity> getOrderDetailEntities() {
		return orderDetailEntities;
	}

	public void setOrderDetailEntities(List<OrderDetailEntity> orderDetailEntities) {
		this.orderDetailEntities = orderDetailEntities;
	}

	public List<PaymentEntity> getPaymentEntities() {
		return paymentEntities;
	}

	public void setPaymentEntities(List<PaymentEntity> paymentEntities) {
		this.paymentEntities = paymentEntities;
	}

	public OrderStatus getRole() {
		return role;
	}

	public void setRole(OrderStatus role) {
		this.role = role;
	}
	 
}
