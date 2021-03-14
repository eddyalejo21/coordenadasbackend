package ec.gob.epmmop.registroCoordenadas.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import ec.gob.epmmop.registroCoordenadas.model.PuntosBacheo;
import ec.gob.epmmop.registroCoordenadas.service.IPuntosBacheoService;

@RestController
@RequestMapping("/procesos")
public class PuntosBacheoController {

	@Autowired
	private IPuntosBacheoService service;
	
	@GetMapping
	public List<PuntosBacheo> listar() {		
			return service.listar();	
	}
	
	@PostMapping
	public ResponseEntity<PuntosBacheo> registrar(@Valid @RequestBody PuntosBacheo puntosBacheo) throws Exception{
		PuntosBacheo punto = new PuntosBacheo();
		punto.setPunEstado('R');
		punto.setPunEstadoAh('A');
		PuntosBacheo obj = service.registrar(puntosBacheo);		
		return new ResponseEntity<PuntosBacheo>(obj, HttpStatus.CREATED);
	}
	

	
	
}
