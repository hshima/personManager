package com.peopleManagerJavaSpringBoot.personManager.dto.request;

import com.sun.jdi.PrimitiveValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String cpf;
    private String birthDate;
    private List<PhoneDTO> phones;
}
