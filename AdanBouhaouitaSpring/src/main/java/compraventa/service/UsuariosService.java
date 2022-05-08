package compraventa.service;

import java.util.List;

import compraventa.entity.Usuarios;
import compraventa.model.UsuariosModel;

public interface UsuariosService {

	public abstract List<UsuariosModel> listarUsuarios();
	
	public abstract UsuariosModel añadirUsuario(UsuariosModel usuariosModel);
	
	public abstract int eliminarUsuario(int id);
	
	public abstract UsuariosModel actualizarUsuario(UsuariosModel usuariosModel);
	
	public abstract Usuarios transform(UsuariosModel usuariosModel);
	
	public abstract UsuariosModel transform(Usuarios usuarios);

}
