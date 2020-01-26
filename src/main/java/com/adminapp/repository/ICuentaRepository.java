package com.adminapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.adminapp.model.Cuenta;

@Repository
public interface ICuentaRepository extends JpaRepository<Cuenta, Integer> {
	
	List<Cuenta> findByTipoMovimientoEquals(String tipoMovimiento);
	List<Cuenta> findBySituacionEquals(String situacion);

}
