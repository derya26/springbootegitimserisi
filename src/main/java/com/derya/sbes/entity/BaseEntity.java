package com.derya.sbes.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@MappedSuperclass //Base Entity yi extend eden tablolarda ortak
public class BaseEntity implements Serializable{  //nesneyi serialize ediyoruz boylelikle nesneyi networkten tasima yetenegi diske yazip okuyabilme
	
	private Date createdAt;
	private String createdBy;
	private Date updatedAt;
	private String updatedBy;

}
