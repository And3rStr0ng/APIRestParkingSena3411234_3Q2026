package com.sena.parqueadero.dto;

import lombok.Data;

@Data
public class RegistroSalidaDTO {

	private Long idRegistro;
	private String placa;
	private Double valorcobrado;
	private Long horasEstadia;
}
