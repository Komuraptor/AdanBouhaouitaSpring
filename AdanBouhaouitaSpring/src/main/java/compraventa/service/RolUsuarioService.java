package compraventa.service;

import compraventa.entity.RolUsuario;
import compraventa.model.RolUsuarioModel;

public interface RolUsuarioService {

	public abstract RolUsuarioModel añadirRolUsuario(RolUsuarioModel rolUsuarioModel);
	
	public abstract RolUsuario transform(RolUsuarioModel rolUsuarioModel);
						
	public abstract RolUsuarioModel transform(RolUsuario rolUsuario);
}
