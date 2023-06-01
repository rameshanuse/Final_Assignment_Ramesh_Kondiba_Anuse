package in.ineuron.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ineuron.bo.Student;
import in.ineuron.service.IStudentService;

/*
 19. Create a Java program that uses Hibernate to insert data into a MySQL database
 	 table. The program should use Hibernate to map the table to a Java object and then
	 insert the data into the table. After inserting the data, the program should retrieve it
	 from the database and display it on the console.
 */

@Component
public class RegisterAppRunner implements CommandLineRunner{

	@Autowired
	public IStudentService service;
	
	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the name of student :: ");
		String sname = scanner.next();

		System.out.print("Enter the age of student :: ");
		int sage = scanner.nextInt();

		System.out.print("Enter the address of studnt :: ");
		String saddress = scanner.next();
		Student student = new Student();
		student.setSname(sname);
		student.setSage((sage));
		student.setSaddress(saddress);

		String msg = service.registerStudent(student);
		System.out.println(msg);
		
		scanner.close();
	}

}
