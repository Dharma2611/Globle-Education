package com.code.Globle.Education.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.code.Globle.Education.Entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	 Optional<Student>  findByEmailId(String emailId);
	 List<Student> findByIntrestedCountryAndIntakeYear(String intrestedCountry ,Integer intakeYear );
	 
	 
	

}
