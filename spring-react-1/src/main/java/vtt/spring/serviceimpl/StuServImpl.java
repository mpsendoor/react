package vtt.spring.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vtt.spring.dao.StudentDaoInterface;
import vtt.spring.entity.StudentBio;
import vtt.spring.service.StudentServiceInterface;

@Service
@Transactional
public class StuServImpl implements StudentServiceInterface {

	@Autowired
	StudentDaoInterface sdi;
	
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
