package teste.example.teste.modules.courses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import teste.example.teste.modules.courses.entities.Course;
import teste.example.teste.modules.courses.repositories.CourseRepository;
import teste.example.teste.modules.courses.services.CreateCourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseRepository repository;

    @PostMapping("/")
    public Course createCourse(@RequestBody Course course) {
        CreateCourseService createCourseService = new CreateCourseService(repository);
        return createCourseService.execute(course);
    }
}

