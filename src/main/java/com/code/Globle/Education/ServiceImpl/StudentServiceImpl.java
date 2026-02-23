package com.code.Globle.Education.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.Globle.Education.Dto.StudentDto;
import com.code.Globle.Education.Entity.Student;
import com.code.Globle.Education.Exception.GlobleEduucationException;
import com.code.Globle.Education.Repo.StudentRepository;
import com.code.Globle.Education.Validator.StudentValidator;
import com.code.Globle.Education.service.StudentService;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;


	@Override
	public StudentDto registrationStudent(StudentDto studentDto) throws GlobleEduucationException {
		StudentValidator.validateStudent(studentDto);
		Optional<Student> byEmailId = studentRepository.findByEmailId(studentDto.getEmailId());
		if(byEmailId.isPresent()) {
			throw new GlobleEduucationException("emailId is not present");
		}
		Student student =  StudentDto.prepareEntity(studentDto);
		student = studentRepository.save(student);
		studentDto.setStudentId(student.getStudentId());
		
		return studentDto;
	}

	@Override
	public List<StudentDto> getStudentByCountryAndInteake(String country, Integer intake) throws GlobleEduucationException {
		List<Student> studentList = studentRepository.findByIntrestedCountryAndIntakeYear(country, intake);
		if(studentList.isEmpty()) {
			throw new GlobleEduucationException("studentList is not presnt");
		}
		List<StudentDto> newList= new  ArrayList<>();
		for(Student student : studentList ) {
			
			StudentDto dto = StudentDto.prepareDTO(student);
			newList.add(dto);
			
		}
		newList.sort((x1,x2)->x1.getStudentName().compareTo(x2.getStudentName()));

		
		return newList;
	}

}
