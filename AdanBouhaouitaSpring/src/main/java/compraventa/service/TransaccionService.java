package compraventa.service;

import java.util.List;

import compraventa.entity.Transaccion;
import compraventa.model.TransaccionModel;

public interface TransaccionService {

	public abstract List<TransaccionModel> listarTransacciones();
	
	public abstract TransaccionModel añadirTransaccion(TransaccionModel transaccionModel);
	
	public abstract Transaccion transform(TransaccionModel transaccionModel);
	
	public abstract TransaccionModel transform(Transaccion transaccion);
	
}
