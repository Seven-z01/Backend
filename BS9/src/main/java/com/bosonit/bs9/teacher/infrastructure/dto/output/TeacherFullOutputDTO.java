package com.bosonit.bs9.teacher.infrastructure.dto.output;

import com.bosonit.bs9.teacher.domain.Teacher;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class TeacherFullOutputDTO extends TeacherOutputDTO {

    private String idPerson;
    private String username;
    private String password;
    private String name;
    private String surname;
    private String companyEmail;
    private String personalEmail;
    private String city;
    private Boolean active;
    private Date createdDate;
    private String imageUrl;
    private Date terminationDate;

    public TeacherFullOutputDTO(Teacher teacher) {
        super(teacher);
        setIdPerson(teacher.getPerson().getIdPerson());
        setUsername(teacher.getPerson().getUsername());
        setName(teacher.getPerson().getName());
        setSurname(teacher.getPerson().getSurname());
        setCompanyEmail(teacher.getPerson().getCompanyEmail());
        setPersonalEmail(teacher.getPerson().getPersonalEmail());
        setCity(teacher.getPerson().getCity());
        setActive(teacher.getPerson().isActive());
        setCreatedDate(teacher.getPerson().getCreatedDate());
        setImageUrl(teacher.getPerson().getImageUrl());
        setTerminationDate(teacher.getPerson().getTerminationDate());
    }
}
