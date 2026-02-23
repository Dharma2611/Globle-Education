package com.code.Globle.Education.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "students")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	 private Integer studentId ;
	 private String studentName;
	 private String emailId; 
	 private String intrestedCountry;
	 private Integer intakeYear;
	 private String studyLevel;
	 private String courseIntrested;

	 

}
