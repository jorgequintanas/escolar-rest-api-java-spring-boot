package com.escolar.springboot.escolar.repositories;

import com.escolar.springboot.escolar.models.Horariodetalle;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorariodetalleRepository extends CrudRepository<Horariodetalle, Integer> {
    
    //@Query("select * from horarios_detalle where id_horario = {idhorario}") ArrayList<Horariodetalle> findByIdHorario(@Param("idhorario") Integer idHorario)
    //public abstract ArrayList<Horariodetalle> ObtenerPorIdHorario(Integer idHorario); 

}
