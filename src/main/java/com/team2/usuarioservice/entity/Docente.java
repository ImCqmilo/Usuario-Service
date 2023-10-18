package com.team2.usuarioservice.entity;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Docentes")
public class Docente {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long docenteId;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String asignatura;
    private String facultad;
}

