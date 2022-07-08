package com.bosonit.ej3.course.application.useCase;

import com.bosonit.ej3.course.application.port.GetCoursePort;
import com.bosonit.ej3.course.infrastructure.dto.output.CourseOutputDTO;
import com.bosonit.ej3.course.infrastructure.repository.CourseRepository;
import com.bosonit.ej3.student.domain.Student;
import com.bosonit.ej3.student.infrastructure.repository.StudentRepository;
import com.bosonit.ej3.exception.NotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GetCourseUseCase implements GetCoursePort {

    @Autowired
    CourseRepository courseRepository;
    @Autowired
    StudentRepository studentRepository;

    @Override
    public CourseOutputDTO getCourseById(String id) {
        return new CourseOutputDTO(courseRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("No course found with id: " + id)));
    }

    @Override
    public List<CourseOutputDTO> getCourseStudentById(String idStudent) {
        Student student = studentRepository.findById(idStudent)
                .orElseThrow(() -> new NotFoundException("No students found with ids: " + idStudent));

        return student.getCourses().stream().map(CourseOutputDTO::new).collect(Collectors.toList());
    }
}
