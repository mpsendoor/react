package vtt.spring.service;

import java.util.List;

import vtt.spring.entity.StudentBio;

public interface StudentServiceInterface {

	public StudentBio getStudent(int id);
	public List<StudentBio> allStudent();
	public boolean saveStudent(StudentBio sb);
	public boolean updateStudent(int id, StudentBio sb);
	public boolean deleteStudent(int id);
	
}
