package nl.gettoworktogether.manytomany;

import nl.gettoworktogether.manytomany.model.Course;
import nl.gettoworktogether.manytomany.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;

@SpringBootApplication
public class ManyToManyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManyToManyApplication.class, args);
	}

}
