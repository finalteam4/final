package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "member_test")
@Entity
public class Member {
	
	@Id  //PK(Primary Key기본키)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	
	@Column(unique = true) //유일성을 가짐, 중복검사
	private String memberEmail;
	
	@Column(nullable = false) //nullable == not null, 필수입력
	private String memberPassword;
	
	@Column(length = 30, nullable = false) // 길이 30byte
	private String memberName;
	
	@Column
	private Long memberAge; 
}

