package com.code.Globle.Education.Dto;

import com.code.Globle.Education.Entity.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {

    private Integer studentId ;

     private String studentName;

     private String emailId;

     private String intrestedCountry;
	 private Integer intakeYear;

     private String studyLevel;

     private String courseIntrested;

	public static Student prepareEntity(StudentDto studentDto) {
		
		Student student = new Student();
		student.setCourseIntrested(studentDto.courseIntrested);
		student.setEmailId(studentDto.getEmailId());
		student.setIntakeYear(studentDto.getIntakeYear());
		student.setIntrestedCountry(studentDto.getIntrestedCountry());
		student.setStudentId(studentDto.getStudentId());
		student.setStudentName(studentDto.getStudentName());
		student.setStudyLevel(studentDto.studyLevel);
		return student;
	}
	public static StudentDto prepareDTO(Student student) {
		StudentDto dto = new StudentDto();
		dto.setCourseIntrested(student.getCourseIntrested());
		dto.setEmailId(student.getEmailId());
		dto.setIntakeYear(student.getInTakeYear());
		dto.setIntrestedCountry(student.getIntrestedCountry());
		dto.setStudentId(student.getStudentId());
		dto.setStudentName(student.getStudentName());
		dto.setStudyLevel(student.getStudyLevel());
		return dto;
	}
	 

}
