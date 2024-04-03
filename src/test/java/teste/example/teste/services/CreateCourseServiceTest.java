package teste.example.teste.services;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import teste.example.teste.modules.courses.entities.Course;
import teste.example.teste.modules.courses.services.CreateCourseService;

public class CreateCourseServiceTest {

    @Test
    public void should_be_able_to_create_a_new_course() {
        // Criar um novo curso
        Course course = new Course();
        course.setDescription("curso_description_teste");
        course.setName("curso_nome");
        course.setWorkload(100);

        // Criar um novo repository
        CourseInMemoryRepository repository = new CourseInMemoryRepository();

        // Criar o serviço
        CreateCourseService createCourseService = new CreateCourseService(repository);
        Course createdCourse = createCourseService.execute(course);

        // Verificar se o curso criado não é nulo
        assertNotNull(createdCourse);

        // Verificar se o ID do curso foi atribuído
        assertNotNull(createdCourse.getId());
    }
}
