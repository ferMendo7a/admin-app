package com.adminapp.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "cuenta")
public class Cuenta {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "descripcion")
	private String descripcion;

	@Column(name = "tipo_movimiento")
	private String tipoMovimiento;
	
	@Column(name = "monto")
	private BigDecimal monto;
	
	@Column(name = "situacion")
	private String situacion;	

}
