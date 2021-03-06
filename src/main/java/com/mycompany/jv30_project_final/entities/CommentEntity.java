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
@Table(name = "comment")
public class CommentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "comment_date")
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date commentDate;
	
	private String content;
	
	 @ManyToOne
	 @JoinColumn(name = "acc_id")
	 private AccountEntity accountEntity;
	 
	 @ManyToOne
	 @JoinColumn(name = "product_comment")
	 private ProductEntity productEntity;

	public CommentEntity() {
		super();
	}

	public CommentEntity(int id, Date commentDate, String content, AccountEntity accountEntity,
			ProductEntity productEntity) {
		super();
		this.id = id;
		this.commentDate = commentDate;
		this.content = content;
		this.accountEntity = accountEntity;
		this.productEntity = productEntity;
	}

	public CommentEntity(Date commentDate, String content, AccountEntity accountEntity, ProductEntity productEntity) {
		super();
		this.commentDate = commentDate;
		this.content = content;
		this.accountEntity = accountEntity;
		this.productEntity = productEntity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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
