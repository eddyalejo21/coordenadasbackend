package ec.gob.epmmop.service.impl;

import java.io.Serializable;
import java.util.List;

import ec.gob.epmmop.registroCoordenadas.repo.IGenericRepo;
import ec.gob.epmmop.registroCoordenadas.service.ICRUD;

public abstract class CRUDImpl <T, ID> implements ICRUD<T, ID> {

	protected abstract IGenericRepo<T,ID> getRepo();
	
	@Override
	public T registrar(T obj) throws Exception {
		return getRepo().save(obj);
	}

	@Override
	public T modificar(T obj) throws Exception {
		return getRepo().save(obj);
	}

	@Override
	public List<T> listar() {
		return getRepo().findAll();
	}
	
	@Override
	public T listarPorId(ID id) throws Exception {
		return getRepo().findOne((Serializable) id);
	}
	
	@Override
	public void eliminar(ID id) throws Exception {
		getRepo().delete((Serializable) id);
	}

}
