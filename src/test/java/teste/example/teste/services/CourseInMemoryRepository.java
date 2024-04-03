package teste.example.teste.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import teste.example.teste.modules.courses.entities.Course;
import teste.example.teste.modules.courses.repositories.ICourseRepository;

public class CourseInMemoryRepository implements ICourseRepository {
    
    private List<Course> courses;

    public CourseInMemoryRepository() {
        this.courses = new ArrayList<>();
    }

    @Override
    public Course findByName(String name) {
        Optional<Course> optionalCourse = this.courses.stream()
                                        .filter(course -> course.getName().equals(name))
                                        .findFirst();
        return optionalCourse.orElse(null);
    }

    @Override 
    public Course save(Course course) {
        course.setId(UUID.randomUUID());
        this.courses.add(course);
        return course;
    }
}
