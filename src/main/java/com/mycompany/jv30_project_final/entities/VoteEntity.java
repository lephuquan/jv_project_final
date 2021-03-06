package com.mycompany.jv30_project_final.entities;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "vote")
public class VoteEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int vote;
	
	@Column(name = "vote_date")
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date voteDate;
	
	@ManyToOne
	@JoinColumn(name = "account_vote_id")
	private AccountEntity accountEntity;
	
	@ManyToOne
	@JoinColumn(name = "Product_vote_id")
	private ProductEntity productEntity;

	public VoteEntity() {
		super();
	}

	public VoteEntity(int id, int vote, Date voteDate, AccountEntity accountEntity, ProductEntity productEntity) {
		super();
		this.id = id;
		this.vote = vote;
		this.voteDate = voteDate;
		this.accountEntity = accountEntity;
		this.productEntity = productEntity;
	}

	public VoteEntity(int vote, Date voteDate, AccountEntity accountEntity, ProductEntity productEntity) {
		super();
		this.vote = vote;
		this.voteDate = voteDate;
		this.accountEntity = accountEntity;
		this.productEntity = productEntity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVote() {
		return vote;
	}

	public void setVote(int vote) {
		this.vote = vote;
	}

	public Date getVoteDate() {
		return voteDate;
	}

	public void setVoteDate(Date voteDate) {
		this.voteDate = voteDate;
	}

	public AccountEntity getAccountEntity() {
		return accountEntity;
	}

	public void setAccountEntity(AccountEntity accountEntity) {
		this.accountEntity = accountEntity;
	}

	public ProductEntity getProductEntity() {
		return productEntity;
	}

	public void setProductEntity(ProductEntity productEntity) {
		this.productEntity = productEntity;
	}
	
	
}
