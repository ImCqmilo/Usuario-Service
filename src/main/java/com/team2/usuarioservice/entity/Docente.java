package com.team2.usuarioservice.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Docente")
public class Docente {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long docenteId;
    private String nombre;
    private String apellido;
    private String telefono;
    @Column(name = "correo_electronico", unique = true)
    private String correo;

}

