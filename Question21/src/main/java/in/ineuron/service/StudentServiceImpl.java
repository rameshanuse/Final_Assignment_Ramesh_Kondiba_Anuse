package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.bo.Student;
import in.ineuron.dao.IStudentRepo;

@Service("service")
public class StudentServiceImpl implements IStudentService {

	@Autowired
	public IStudentRepo repo;

	@Override
	public String registerStudent(Student student) {
		Student student2 = null;
		if (student != null) {
			student2 = repo.save(student);
		}
		return student2 != null ? "Student registration successfull with student id :: " + student2.getSid()
				: "Student registration failed";
	}

}
