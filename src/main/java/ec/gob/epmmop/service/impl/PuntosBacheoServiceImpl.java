package ec.gob.epmmop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.gob.epmmop.registroCoordenadas.model.PuntosBacheo;
import ec.gob.epmmop.registroCoordenadas.repo.IGenericRepo;
import ec.gob.epmmop.registroCoordenadas.repo.IPuntosBacheoRepo;
import ec.gob.epmmop.registroCoordenadas.service.IPuntosBacheoService;

@Service
public class PuntosBacheoServiceImpl extends CRUDImpl<PuntosBacheo, Integer> implements IPuntosBacheoService {

	@Autowired
	private IPuntosBacheoRepo repo;
	
	@Override
	protected IGenericRepo<PuntosBacheo, Integer> getRepo(){
		return repo;
	}
	

}
