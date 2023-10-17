package com.team2.usuarioservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="coordinadores")
public class Coordinador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long coordinadorId;
    private String nombre;
    private String apellido;
    private String telefono;
    @Column(name= "correo_electronico", unique = true)
    private String correo;
}
