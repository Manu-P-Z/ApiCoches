package com.manu.ApiCoches.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.manu.ApiCoches.entities.Coche;
import com.manu.ApiCoches.entities.Traccion;
import com.manu.ApiCoches.repository.CocheRepository;

@Service
public class CocheServiceImpl implements CocheService {

	@Autowired
    private CocheRepository cr;

	@Override
	public List<Coche> findAll() {
		return cr.findAll();
	}
	
	@Override
	public Optional<Coche> FindById(String id) {
		return cr.findById(id);
	}
	
	@Override
	public Coche modifyCoche(String id, Coche newCoche) {
		
		Coche coche = cr.findById(id).orElse(null);
		
		newCoche.setId(coche.getId());
		return cr.save(newCoche);
		
	}
	
	@Override
	public Coche deleteCoche(String id) {
		Coche coche = cr.findById(id).orElse(null);
		if(coche==null) {
			return coche;
		}
		
		 cr.deleteById(id);
		 return coche;
	}



	@Override
	public Coche save(Coche coche) {
		return cr.save(coche);
	}

	@Override
	public List<Coche> FindByYear(String year) {
		return cr.findByYear(year);
	}

	@Override
	public List<Coche> FindByTraccion(String traccion) {
		return cr.findByTraccion(traccion);
	}


	@Override
	public List<Coche> FindByMarca(String marca) {
		return cr.findByMarca(marca);
	}

	@Override
	public List<Coche> FindByModelo(String modelo) {
		return cr.findByModelo(modelo);
	}

	@Override
	public List<Coche> FindByTipoMotor(String tipoMotor) {
		return cr.findByTipoMotor(tipoMotor);
	}

	@Override
	public List<Coche> FindByCombustible(String combustible) {
		return cr.findByCombustible(combustible);
	}

	@Override
	public List<Coche> FindByCilindrada(Float cilindrada) {
		return cr.findByCilindrada(cilindrada);
	}

	@Override
	public List<Coche> FindBySobrealimentacion(String sobrealimentacion) {
		return cr.findBySobrealimentacion(sobrealimentacion);
	}

	@Override
	public List<Coche> FindByTransmision(String transmision) {
		return cr.findByTransmision(transmision);

	}

	@Override
	public List<Coche> FindByMarcaAndTipoMotor(String tipoMotor, String marca) {
		return cr.findByMarcaAndTipoMotor(tipoMotor,marca);
	}

}
