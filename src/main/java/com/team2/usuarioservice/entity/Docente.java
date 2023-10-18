package com.team2.usuarioservice.entity;

import jakarta.persistence.*;
import lombok.*;


@Data
@Entity //Esto es parte de JPA que es Java Persitence API
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="docentes")

public class Docente {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String coordinador;
}

