package teste.example.teste.modules.courses.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import teste.example.teste.modules.courses.entities.Course;

public interface CourseJPARepository extends JpaRepository<Course,UUID>{
    public Course  findByName(String name);
    
}
