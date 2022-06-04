package com.escolar.springboot.escolar.repositories;

import com.escolar.springboot.escolar.models.Horario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorarioRepository extends CrudRepository<Horario, Integer> {
   
    //@Query("select * from horarios_detalle where id_horario = ?1") ArrayList<Horariodetalle> findDetails(Horario horario);
}
