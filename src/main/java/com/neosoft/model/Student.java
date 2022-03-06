package com.neosoft.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
@Table(name = "STUDENT")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @NotBlank(message = "First name cannot be blank")
    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @NotBlank(message = "Last name cannot be blank")
    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    @Pattern(regexp = "^[1-9][0-9]{9}$", message = "Enter valid mobile number")
    @Column(name = "MOBILE_NUMBER", nullable = false)
    @NotBlank(message = "Mobile number cannot be blank")
    private String mobileNumber;

    @Email(message = "Enter valid email address")
    @NotBlank(message = "Email address name cannot be blank")
    @Column(name = "EMAIL", nullable = false)
    private String email;

    @OneToMany(mappedBy = "student")
    private List<Project> projects;

}
