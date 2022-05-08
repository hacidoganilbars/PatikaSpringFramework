package com.doganilbars.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDto {
    private Long studenId;
    private String studentName;
    private String studentSurname;
}
