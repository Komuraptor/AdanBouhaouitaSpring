package compraventa.service;

import java.util.List;

import compraventa.entity.Mensajes;
import compraventa.model.MensajesModel;

public interface MensajesService {

	public abstract List<MensajesModel> listarMensajes();
	
	public abstract MensajesModel añadirMensaje(MensajesModel mensajesModel);
	
	public abstract int eliminarMensaje(int id);
	
	public abstract Mensajes transform(MensajesModel mensajesModel);
	
	public abstract MensajesModel transform(Mensajes mensajes);
}
