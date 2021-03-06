/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jv30_project_final.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author AnhLe
 */
@Entity
@Table(name = "account")
public class AccountEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String email;
    private String password;

    @ManyToMany(cascade = {CascadeType.PERSIST,
        CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinTable(name = "acc_role_relationship",
            joinColumns = @JoinColumn(name = "acc_id",
                    referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "acc_role_id",
                    referencedColumnName = "id"))
    private List<AccountRoleEntity> accountRoles;

    
    @OneToMany(mappedBy = "accountEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<CommentEntity>  commentEntities;
    
    @OneToMany(mappedBy = "accountEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<VoteEntity> voteEntities;
    
    @OneToMany(mappedBy = "accountEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 private List<OrderEntity>  orderEntities;
    
    public AccountEntity() {
    }
    
	

	public AccountEntity(String email, String password, List<AccountRoleEntity> accountRoles,
			List<CommentEntity> commentEntities, List<VoteEntity> voteEntities, List<OrderEntity> orderEntities) {
		super();
		this.email = email;
		this.password = password;
		this.accountRoles = accountRoles;
		this.commentEntities = commentEntities;
		this.voteEntities = voteEntities;
		this.orderEntities = orderEntities;
	}



	public AccountEntity(int id, String email, String password, List<AccountRoleEntity> accountRoles,
			List<CommentEntity> commentEntities, List<VoteEntity> voteEntities, List<OrderEntity> orderEntities) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.accountRoles = accountRoles;
		this.commentEntities = commentEntities;
		this.voteEntities = voteEntities;
		this.orderEntities = orderEntities;
	}

	public List<OrderEntity> getOrderEntities() {
		return orderEntities;
	}



	public void setOrderEntities(List<OrderEntity> orderEntities) {
		this.orderEntities = orderEntities;
	}



	public List<VoteEntity> getVoteEntities() {
		return voteEntities;
	}



	public void setVoteEntities(List<VoteEntity> voteEntities) {
		this.voteEntities = voteEntities;
	}



	public List<CommentEntity> getCommentEntities() {
		return commentEntities;
	}



	public void setCommentEntities(List<CommentEntity> commentEntities) {
		this.commentEntities = commentEntities;
	}



	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<AccountRoleEntity> getAccountRoles() {
        return accountRoles;
    }

    public void setAccountRoles(List<AccountRoleEntity> accountRoles) {
        this.accountRoles = accountRoles;
    }

}
