package com.neosoft.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "PROJECT")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Project {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @ManyToOne
    private Student student;

    @NotBlank(message = "Project name cannot be blank")
    @Column(name = "PROJECT_NAME", nullable = false)
    private String projectName;

    @NotBlank(message = "Duration cannot be blank")
    @Column(name = "DURATION", nullable = false)
    private Integer duration;

}
