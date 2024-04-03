package teste.example.teste.modules.courses.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import teste.example.teste.modules.courses.entities.Course;
import teste.example.teste.modules.courses.repositories.ICourseRepository;

@Service
public class CreateCourseService {
    private ICourseRepository repository;

    public CreateCourseService(ICourseRepository repository) {
        this.repository = repository;
    }

    public Course execute(Course course) {
        // Validate if the course exists
        Course existedCourse = this.repository.findByName(course.getName());

        if (existedCourse != null) {
            throw new RuntimeException("Curso já existe");
        }

        return repository.save(course);
    }
}
