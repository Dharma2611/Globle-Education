package com.code.Globle.Education.Entity;


import jakarta.persistence.*;


@Entity
public class Roles {
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 @Enumerated(EnumType.STRING)
	 @Column(length = 20)
	 private ERole name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ERole getName() {
		return name;
	}
	public void setName(ERole name) {
		this.name = name;
	}
	  public Roles() {

	  }

}
