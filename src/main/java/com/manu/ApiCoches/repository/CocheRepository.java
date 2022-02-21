package com.manu.ApiCoches.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.manu.ApiCoches.entities.Coche;

@Repository
public interface CocheRepository extends MongoRepository<Coche, String> {


	List<Coche> findByYear(String year);

	List<Coche> findByTraccion(String traccion);

	List<Coche> findByMarca(String marca);

	List<Coche> findByModelo(String modelo);

	List<Coche> findByTipoMotor(String tipoMotor);

	List<Coche> findByCombustible(String combustible);

	List<Coche> findByCilindrada(Float cilindrada);

	List<Coche> findBySobrealimentacion(String sobrealimentacion);

	List<Coche> findByTransmision(String transmision);

	List<Coche> findByMarcaAndTipoMotor(String tipoMotor, String marca);

}
