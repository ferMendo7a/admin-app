package com.adminapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adminapp.model.Cuenta;
import com.adminapp.service.CuentaService;

@RestController
@RequestMapping(path = "/cuenta")
public class CuentaController {

	@Autowired
	CuentaService service;
	
	@GetMapping("/todos")
	public ResponseEntity<List<Cuenta>> getAll() {
		List<Cuenta> cuentaList = service.getAllActivos();
		return ResponseEntity.ok().body(cuentaList);
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<Cuenta> postObject(@RequestBody Cuenta cuenta) {
		return ResponseEntity.ok().body(service.guardar(cuenta));
	}
	
	@GetMapping("/query/{tipo_movimiento}")
	public ResponseEntity<List<Cuenta>> getByTipoMovimiento(@PathVariable("tipo_movimiento") String tipoMovimiento) {
		List<Cuenta> cuentaList = service.findByTipoMovimientoEntrada(tipoMovimiento);
		return ResponseEntity.ok().body(cuentaList);
	}
		
}
