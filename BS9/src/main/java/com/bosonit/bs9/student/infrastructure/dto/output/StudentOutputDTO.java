package com.bosonit.bs9.student.infrastructure.dto.output;

import com.bosonit.bs9.course.domain.Course;
import com.bosonit.bs9.student.domain.Student;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class StudentOutputDTO {

    private String idStudent;
    private String idPerson;
    private String idTeacher;
    private int numHoursWeek;
    private String comments;
    private String branch;
    private List<String> courses = new ArrayList<>();

    public StudentOutputDTO(Student student) {
        setIdStudent(student.getIdStudent());
        setIdPerson(student.getPerson().getIdPerson());
        setIdTeacher(student.getTeacher().getIdTeacher());
        setNumHoursWeek(student.getNumHoursWeek());
        setComments(student.getComments());
        setBranch(student.getBranch());
        setCourses(student.getCourses().stream().map(Course::getIdCourse).toList());
    }
}
