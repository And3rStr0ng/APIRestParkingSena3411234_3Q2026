package com.sena.parqueadero.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.parqueadero.model.Registro;
import com.sena.parqueadero.model.TipoVehiculo;

public interface IRegistrorepository extends JpaRepository<Registro, Long> {

	Optional<Registro> findByVehiculoPlacaAndActivoTrue(String placa);

	List<Registro> findByActivoTrue();

	boolean existByVehiculoIdVehiculo(Long vehiculoId);

	boolean axistByVehiculoTipo(TipoVehiculo tipoVehiculo);

}
