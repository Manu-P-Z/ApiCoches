package com.manu.ApiCoches.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.manu.ApiCoches.entities.Coche;
import com.manu.ApiCoches.entities.Combustible;
import com.manu.ApiCoches.entities.Marca;
import com.manu.ApiCoches.entities.Sobrealimentacion;
import com.manu.ApiCoches.entities.TipoMotor;
import com.manu.ApiCoches.entities.Traccion;
import com.manu.ApiCoches.entities.Transmision;
import com.manu.ApiCoches.service.CocheService;

@RestController
public class CocheController {

		@Autowired
		private CocheService cocheService;

		
		@GetMapping("/Coches")
		public ResponseEntity<List<Coche>> getCoches(@RequestParam Map<String, String> allParams) {
			
			List<Coche> resultado = new ArrayList<>();

			if(allParams.get("id") != null) {
				Coche coche = cocheService.FindById(allParams.get("id")).orElse(null);
				resultado.add(coche);				
				return new ResponseEntity<List<Coche>>(resultado,HttpStatus.OK);
			}
			if(allParams.get("marca") != null) {
				resultado = (cocheService.FindByMarca(allParams.get("marca")));				
				return new ResponseEntity<List<Coche>>(resultado,HttpStatus.OK);
			}
			if(allParams.get("modelo") != null) {
				resultado = (cocheService.FindByModelo(allParams.get("modelo")));				
				return new ResponseEntity<List<Coche>>(resultado,HttpStatus.OK);
			}
			if(allParams.get("year") != null) {
				resultado = (cocheService.FindByYear(allParams.get("year")));				
				return new ResponseEntity<List<Coche>>(resultado,HttpStatus.OK);
			}
			if(allParams.get("tipoMotor") != null) {
				resultado = (cocheService.FindByTipoMotor(allParams.get("tipoMotor")));				
				return new ResponseEntity<List<Coche>>(resultado,HttpStatus.OK);
			}
			if(allParams.get("combustible") != null) {
				resultado = (cocheService.FindByCombustible(allParams.get("combustible")));				
				return new ResponseEntity<List<Coche>>(resultado,HttpStatus.OK);
			}
			if(allParams.get("cilindrada") != null) {
				resultado = (cocheService.FindByCilindrada(Float.parseFloat(allParams.get("cilindrada"))));				
				return new ResponseEntity<List<Coche>>(resultado,HttpStatus.OK);
			}
			if(allParams.get("traccion") != null) {
				resultado = (cocheService.FindByTraccion(allParams.get("traccion")));				
				return new ResponseEntity<List<Coche>>(resultado,HttpStatus.OK);
			}
			if(allParams.get("sobrealimentacion") != null) {
				resultado = (cocheService.FindBySobrealimentacion(allParams.get("sobrealimentacion")));				
				return new ResponseEntity<List<Coche>>(resultado,HttpStatus.OK);
			}
			if(allParams.get("transmision") != null) {
				resultado = (cocheService.FindByTransmision(allParams.get("transmision")));				
				return new ResponseEntity<List<Coche>>(resultado,HttpStatus.OK);
			}
			
			if(allParams.get("tipoMotor") != null && allParams.get("marca") != null) {
				resultado = (cocheService.FindByMarcaAndTipoMotor(allParams.get("tipoMotor"),allParams.get("marca")));				
				return new ResponseEntity<List<Coche>>(resultado,HttpStatus.OK);
			}
			
			
			return new ResponseEntity<>(cocheService.findAll(), HttpStatus.OK);
			
		}
		
		@GetMapping("/Coches/{id}")
		public ResponseEntity<Coche> getCoche(@PathVariable String id) {
			Coche coche = cocheService.FindById(id).orElse(null);
			if(coche==null)
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			return new ResponseEntity<Coche>( coche,HttpStatus.OK);
		}
		
		
		@GetMapping("/Coches/Marca")
		public ResponseEntity<Marca[]> getMarca() {
			return new ResponseEntity<>(Marca.values(),HttpStatus.OK);
		}
		
		@GetMapping("/Coches/Marca/{marca}")
		public ResponseEntity<List<Coche>> getCochesByMarca(@PathVariable String marca) {
			return new ResponseEntity<>(cocheService.FindByMarca(marca),HttpStatus.OK);
		}
	
		
		@GetMapping("/Coches/Modelo/{modelo}")
		public ResponseEntity<List<Coche>> getCochesByModelo(@PathVariable String modelo) {
			return new ResponseEntity<>(cocheService.FindByModelo(modelo),HttpStatus.OK);
		}
		
		@GetMapping("/Coches/TipoMotor")
		public ResponseEntity<TipoMotor[]> getTipoMotor() {
			return new ResponseEntity<>(TipoMotor.values(),HttpStatus.OK);
		}
		
		@GetMapping("/Coches/TipoMotor/{tipoMotor}")
		public ResponseEntity<List<Coche>> getCochesByTipoMotor(@PathVariable String tipoMotor) {
			return new ResponseEntity<>(cocheService.FindByTipoMotor(tipoMotor),HttpStatus.OK);
		}
		
		@GetMapping("/Coches/Combustible")
		public ResponseEntity<Combustible[]> getCombustible() {
			return new ResponseEntity<>(Combustible.values(),HttpStatus.OK);
		}
		
		@GetMapping("/Coches/Combustible/{combustible}")
		public ResponseEntity<List<Coche>> getCochesByCombistible(@PathVariable String combustible) {
			return new ResponseEntity<>(cocheService.FindByCombustible(combustible),HttpStatus.OK);
		}
		
		@GetMapping("/Coches/Traccion")
		public ResponseEntity<Traccion[]> getTraccion() {
			return new ResponseEntity<>(Traccion.values(),HttpStatus.OK);
		}
	
		@GetMapping("/Coches/Traccion/{traccion}")
		public ResponseEntity<List<Coche>> getCochesByTraccion(@PathVariable String traccion) {
			return new ResponseEntity<>(cocheService.FindByTraccion(traccion),HttpStatus.OK);
		}
		
		@GetMapping("/Coches/Sobrealimentacion")
		public ResponseEntity<Sobrealimentacion[]> getSobrealimentacion() {
			return new ResponseEntity<>(Sobrealimentacion.values(),HttpStatus.OK);
		}
		
		@GetMapping("/Coches/Sobrealimentacion/{sobreAlimentacion}")
		public ResponseEntity<List<Coche>> getCochesBySobrealimentacion(@PathVariable String sobrealimentacion) {
			return new ResponseEntity<>(cocheService.FindBySobrealimentacion(sobrealimentacion),HttpStatus.OK);
		}
		
		@GetMapping("/Coches/Transmision")
		public ResponseEntity<Transmision[]> getTransmision() {
			return new ResponseEntity<>(Transmision.values(),HttpStatus.OK);
		}
		
		@GetMapping("/Coches/Transmision/{transmision}")
		public ResponseEntity<List<Coche>> getCochesByCajaCambios(@PathVariable String transmision) {
			return new ResponseEntity<>(cocheService.FindByTransmision(transmision),HttpStatus.OK);
		}
		

		
	    @PostMapping("/Coches")
	    public ResponseEntity<Coche> addCoche(@RequestBody Coche coche) {
	        Coche addedCoche = cocheService.save(coche);
	        return new ResponseEntity<>(addedCoche, HttpStatus.CREATED);
	    }
	    
	    @PutMapping("/Coches/{id}")
		public ResponseEntity<Coche> putCoche(@PathVariable String id, @RequestBody Coche cocheNuevo) {
			Coche coche = cocheService.modifyCoche(id, cocheNuevo);
			if(coche==null)
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
			return new ResponseEntity<Coche>(coche,HttpStatus.ACCEPTED);
		}
	    
	    @DeleteMapping("/Coches/{id}")
	    public ResponseEntity<String> deleteCliente(@PathVariable String id) {
	    	Coche coche = cocheService.deleteCoche(id);
	    	if(coche == null)
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			return new ResponseEntity<String>("Se ha borrado el coche",HttpStatus.OK);
	    	
	    }
	    
		
}
