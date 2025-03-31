package com.iticbcn.webapp.mywebapp.Model;

import lombok.*;
import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "books")
public class Llibre implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID generado automáticamente
    private int idLlibre;

    @Column(nullable = false)
    private String titol;

    @Column(nullable = false)
    private String autor;

    private String editorial;

    @Column(nullable = false, unique = true)
    private String isbn; // Nuevo campo con restricciones

    @Column(nullable = false)
    private LocalDate datapublicacio; // Cambiado de String a LocalDate

    private String tematica;
}
