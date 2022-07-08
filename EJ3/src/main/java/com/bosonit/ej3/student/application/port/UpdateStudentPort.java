package com.bosonit.ej3.student.application.port;

import com.bosonit.ej3.student.domain.Student;
import com.bosonit.ej3.student.infrastructure.dto.input.StudentInputDTO;
import com.bosonit.ej3.student.infrastructure.dto.output.StudentOutputDTO;

public interface UpdateStudentPort {
    Student getStudentId(String id);
    StudentOutputDTO updateStudent(String id, StudentInputDTO studentInputDTO);
}
