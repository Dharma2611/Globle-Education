package com.code.Globle.Education.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Entity
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Roles {
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 @Enumerated(EnumType.STRING)
	 @Column(length = 20)
	 private ERole name;


}
