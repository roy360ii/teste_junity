package teste.example.teste.modules.courses.repositories;

import teste.example.teste.modules.courses.entities.Course;

public interface ICourseRepository {
    public Course findByName(String name);
    public Course save(Course course);
    
}
