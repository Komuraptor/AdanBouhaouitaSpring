package compraventa.service;

import java.util.List;

import compraventa.entity.Valoraciones;
import compraventa.model.ValoracionesModel;

public interface ValoracionesService {

	public abstract List<ValoracionesModel> listarValoraciones();
	
	public abstract ValoracionesModel añadirValoracion(ValoracionesModel valoracionesModel);
	
	public abstract Valoraciones transform(ValoracionesModel valoracionesModel);
	
	public abstract ValoracionesModel transform(Valoraciones valoraciones);

}
