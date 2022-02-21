package com.manu.ApiCoches.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.manu.ApiCoches.entities.Coche;
import com.manu.ApiCoches.entities.Traccion;

public interface CocheService {
	
List<Coche> findAll();

Coche save(Coche coche);
Optional<Coche> FindById(String id);
Coche modifyCoche(String id, Coche coche);
Coche deleteCoche(String id);

List<Coche> FindByYear(String year);
List<Coche> FindByTraccion(String traccion);
List<Coche> FindByMarca(String marca);
List<Coche> FindByModelo(String modelo);
List<Coche> FindByTipoMotor(String tipoMotor);
List<Coche> FindByCombustible(String combustible);
List<Coche> FindByCilindrada(Float cilindrada);
List<Coche> FindBySobrealimentacion(String sobrealimentacion);
List<Coche> FindByTransmision(String transmision);

List<Coche> FindByMarcaAndTipoMotor(String tipoMotor, String marca);
}
