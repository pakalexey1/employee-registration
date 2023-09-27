package com.example.employeeregistration.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

//    @NotNull //accepts everything besides null, e.g. "" is acceptable
//    @NotEmpty //same as null plus doesn't accept "", e.g. " " is acceptable
//    @NotBlank //same as empty plus doesn't accept " "

    @NotBlank
    @Size(max=12, min=2)
    private String firstName;
    private String lastName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

}
