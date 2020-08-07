package com.peopleManagerJavaSpringBoot.personManager.entity;

import com.peopleManagerJavaSpringBoot.personManager.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data // Inserts getters and setters
@Builder // gives project patterns
@AllArgsConstructor // Adds Constructors
@NoArgsConstructor // Adds Constructors
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;

    @Column(nullable = false)
    private String number;
}
