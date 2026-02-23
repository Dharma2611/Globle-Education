package com.code.Globle.Education.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.Globle.Education.Dto.StudentDto;
import com.code.Globle.Education.Exception.GlobleEduucationException;
import com.code.Globle.Education.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "globle-edu")
@Validated

public class StudentApi {
	
	@Autowired
	private StudentService studentService;
	@PostMapping(value = "student" , consumes = "application/json")
	public ResponseEntity<StudentDto> registerStuddent( @RequestBody @Valid StudentDto studentDto) throws GlobleEduucationException{
		StudentDto registrationStudent = studentService.registrationStudent(studentDto);
		return new ResponseEntity<StudentDto>(registrationStudent,HttpStatus.CREATED);
		
	}
	@GetMapping(value = "student/{country}/{intakeYear}")
	public ResponseEntity<List<StudentDto>> getstudentbyemail(  @PathVariable  String country , @PathVariable Integer intakeYear) throws GlobleEduucationException{
		List<StudentDto> studentList = studentService.getStudentByCountryAndInteake(country, intakeYear);
		return new ResponseEntity<List<StudentDto>>(studentList,HttpStatus.OK);
		
	}

}
