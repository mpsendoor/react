package vtt.spring.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import vtt.spring.dao.StudentDaoInterface;
import vtt.spring.entity.StudentBio;

@Repository
public class StuDaoImpl implements StudentDaoInterface {

	@Override
	public StudentBio getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentBio> allStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveStudent(StudentBio sb) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateStudent(int id, StudentBio sb) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
