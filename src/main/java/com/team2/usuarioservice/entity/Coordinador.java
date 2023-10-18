package com.team2.usuarioservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity //Esto es parte de JPA que es Java Persitence API
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="coordinadores")
public class Coordinador {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long coordinadorId;
    private String nombre;
    private String apellido;
    private String telefono;
    @Column(name="correo_electronico", unique = true)
    private String correo;
}


