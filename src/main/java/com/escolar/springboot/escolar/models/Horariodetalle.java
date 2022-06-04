package com.escolar.springboot.escolar.models;

import java.sql.Time;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "horarios_detalle")

public class Horariodetalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "id_horario", nullable = false)
    Horario horario;
    
    @Column(name = "dia_semana", nullable = false)
    private Integer diaSemana;
    @Column(name = "hora_inicio", nullable = false)
    private Time horaInicio;
    @Column(name = "hora_fin", nullable = false)
    private Time horaFin;
  
}
