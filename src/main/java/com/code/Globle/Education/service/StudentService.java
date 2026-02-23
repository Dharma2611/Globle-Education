package com.code.Globle.Education.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.code.Globle.Education.Dto.StudentDto;
import com.code.Globle.Education.Exception.GlobleEduucationException;
@Service
public interface StudentService {
	StudentDto registrationStudent (StudentDto studentDto)throws GlobleEduucationException;
	List<StudentDto> getStudentByCountryAndInteake(String country ,Integer intake)throws GlobleEduucationException;

}
