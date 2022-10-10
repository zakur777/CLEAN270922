package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.services.administracion;

import java.util.Optional;

import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.dto.ProveedorDTO;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.services.exceptions.ServiceException;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.services.generic.GenericService;

public interface ProveedorService extends GenericService<ProveedorDTO>{

	Optional<ProveedorDTO> findByRUC(String ruc) throws ServiceException;
	
}
