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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "credit_card")
public class CreditCardEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@Column(name = "card_number")
	private String cardNumber;
	
	@Column(name = "exp_date")
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date expDate;
	
	@Column(name = "cvc_code")
	private String cvcCode;
	
	private double Balance;
	
	private String status;
	
	@OneToMany(mappedBy = "creditCardEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<PaymentEntity> paymentEntities;

	public CreditCardEntity() {
		super();
	}

	public CreditCardEntity(int id, String name, String cardNumber, Date expDate, String cvcCode, double balance,
			String status, List<PaymentEntity> paymentEntities) {
		super();
		this.id = id;
		this.name = name;
		this.cardNumber = cardNumber;
		this.expDate = expDate;
		this.cvcCode = cvcCode;
		Balance = balance;
		this.status = status;
		this.paymentEntities = paymentEntities;
	}

	public CreditCardEntity(String name, String cardNumber, Date expDate, String cvcCode, double balance, String status,
			List<PaymentEntity> paymentEntities) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.expDate = expDate;
		this.cvcCode = cvcCode;
		Balance = balance;
		this.status = status;
		this.paymentEntities = paymentEntities;
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

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public String getCvcCode() {
		return cvcCode;
	}

	public void setCvcCode(String cvcCode) {
		this.cvcCode = cvcCode;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<PaymentEntity> getPaymentEntities() {
		return paymentEntities;
	}

	public void setPaymentEntities(List<PaymentEntity> paymentEntities) {
		this.paymentEntities = paymentEntities;
	}
	
	
}
