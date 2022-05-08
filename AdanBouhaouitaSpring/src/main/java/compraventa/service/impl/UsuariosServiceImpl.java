package compraventa.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import compraventa.entity.Usuarios;
import compraventa.model.UsuariosModel;
import compraventa.repository.UsuariosRepository;
import compraventa.service.UsuariosService;

@Service("usuariosServiceImpl")
public class UsuariosServiceImpl implements UsuariosService {
	
	@Autowired
	@Qualifier("usuariosRepository")
	private UsuariosRepository usuariosRepository;
	
	@Autowired
	private DozerBeanMapper dozer;

	@Override
	public List<UsuariosModel> listarUsuarios() {
		List<Usuarios> listaU = usuariosRepository.findAll();
		List<UsuariosModel> listaUM = new ArrayList<>();
		listaU.forEach(u->{
			UsuariosModel UsuariosModel=transform(u);
			listaUM.add(UsuariosModel);
		});
		Collections.sort(listaUM, (UsuariosModel a1, UsuariosModel a2) -> a1.getNombre().compareTo(a2.getNombre()));
		
		return listaUM;
	}

	@Override
	public UsuariosModel añadirUsuario(UsuariosModel usuariosModel) {
		Usuarios usuarios = transform(usuariosModel);
		return transform(usuariosRepository.save(usuarios));
	}

	@Override
	public int eliminarUsuario(int id) {
		usuariosRepository.deleteById(id);
		return 0;
	}

	@Override
	public UsuariosModel actualizarUsuario(UsuariosModel usuariosModel) {
		Usuarios usuarios = transform(usuariosModel);
		return transform(usuariosRepository.save(usuarios));
	}

	@Override
	public Usuarios transform(UsuariosModel usuariosModel) {
		return dozer.map(usuariosModel, Usuarios.class);
	}

	@Override
	public UsuariosModel transform(Usuarios usuarios) {
		return dozer.map(usuarios, UsuariosModel.class);
	}

}
