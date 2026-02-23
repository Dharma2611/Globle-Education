package com.code.Globle.Education.Validator;

import java.time.LocalDate;

import com.code.Globle.Education.Dto.StudentDto;
import com.code.Globle.Education.Exception.GlobleEduucationException;

public class StudentValidator {

	public static void validateStudent(StudentDto studentDto) throws GlobleEduucationException {
		if (!isValidIntakeYear(studentDto.getIntakeYear())) {
			throw new GlobleEduucationException("Year should be in the past");
		}
	}

	public static boolean isValidIntakeYear(Integer intakeYear) {
		int currentYear = LocalDate.now().getYear();
		return intakeYear < currentYear;   // ✅ only past years are valid
	}
}