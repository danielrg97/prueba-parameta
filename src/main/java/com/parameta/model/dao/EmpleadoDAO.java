package com.parameta.model.dao;

import com.parameta.model.entities.Empleado;
import org.springframework.data.repository.CrudRepository;

public interface EmpleadoDAO extends CrudRepository<Empleado, Integer> {
}
