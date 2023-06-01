package in.ineuron.service;

import in.ineuron.dao.IStudentDao;
import in.ineuron.daofactory.StudentDaoFactory;
import in.ineuron.dto.Student;

public class StudentServiceImpl implements IStudentService {

	IStudentDao studentDao = StudentDaoFactory.getStudentDao();
	
	@Override
	public Student searchStudent(int sid) {
		return studentDao.searchStudent(sid);
	}

}
