package compraventa.service;

import java.util.List;

import compraventa.entity.Articulos;
import compraventa.model.ArticulosModel;

public interface ArticulosService {
	
	public abstract List<ArticulosModel> listarArticulos();
	
	public abstract ArticulosModel añadirArticulo(ArticulosModel articulosModel);
	
	public abstract int eliminarArticulo(int id);
	
	public abstract ArticulosModel actualizarArticulos(ArticulosModel articulosModel);
	
	public abstract Articulos transform(ArticulosModel articulosModel);
	
	public abstract ArticulosModel transform(Articulos articulos);
	
}
