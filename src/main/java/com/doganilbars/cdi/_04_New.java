package com.doganilbars.cdi;

import com.doganilbars.dto.StudentDto;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;

@Named(value = "newTuto")
@ApplicationScoped
public class _04_New {

    //Üretilen
    @Produces
    private String uretilenData(StudentDto studentDto){
        studentDto = StudentDto.builder().studenId(0L).studentName("Öğrenci Adı").build();
        return studentDto.getStudentName();
    }

    @Getter
    @Inject
    private String tuketilenData;

}
