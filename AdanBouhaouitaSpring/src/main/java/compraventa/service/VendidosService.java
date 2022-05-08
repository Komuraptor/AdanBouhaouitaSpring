package compraventa.service;

import java.util.List;

import compraventa.entity.Vendidos;
import compraventa.model.VendidosModel;

public interface VendidosService {

	public abstract List<VendidosModel> listarVendidos();
	
	public abstract VendidosModel añadirVendido(VendidosModel vendidosModel);
	
	public abstract int eliminarVendido(int id);
	
	public abstract VendidosModel actualizarVendidos(VendidosModel vendidosModel);
	
	public abstract Vendidos transform(VendidosModel vendidosModel);
	
	public abstract VendidosModel transform(Vendidos vendidos);
	
}
