package com.doganilbars.cdi;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder


//cdi->bean
@Named("namedTuto")
@ApplicationScoped
public class _01_Named {

    private Long namedId;
    private String namedData = "Merhabalar Named Cdi Bean";

}
