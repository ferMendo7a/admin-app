package com.adminapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adminapp.model.Cuenta;
import com.adminapp.repository.ICuentaRepository;
import com.adminapp.util.Constantes;

@Service
public class CuentaService {

	@Autowired
	ICuentaRepository repository;
	
	public Cuenta guardar(Cuenta cuenta) {
		return repository.save(cuenta);
	}
	
	public List<Cuenta> getAllActivos() {
		return repository.findBySituacionEquals(Constantes.ACTIVO);
	}
	
	public List<Cuenta> findByTipoMovimientoEntrada(String tipoMovimiento) {
		return repository.findByTipoMovimientoEquals(tipoMovimiento);
	}
	
}
