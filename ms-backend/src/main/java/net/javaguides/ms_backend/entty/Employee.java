package net.javaguides.ms_backend.entty;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")

    private String first_name;
    @Column(name = "last_name")

    private String last_name;
    @Column(name = "email", nullable = false, unique = true)
    private String email;

}
