package com.teste.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Deals {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "deal_id")
    private String id;
    
    @Column(name = "deal_name")
    private String dealName;
    
    public void setId(String id) {
	this.id = id;
    }
    
    public void setDealName(String dealName) {
	this.dealName = dealName;
    }
    
    public String getId() {
	return id;
    }
    
    public String getDealName() {
	return dealName;
    }
}
