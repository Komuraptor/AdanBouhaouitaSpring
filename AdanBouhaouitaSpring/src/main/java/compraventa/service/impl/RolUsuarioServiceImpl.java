package compraventa.service.impl;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import compraventa.entity.RolUsuario;
import compraventa.model.RolUsuarioModel;
import compraventa.repository.RolUsuarioRepository;
import compraventa.service.RolUsuarioService;

@Service("rolUsuarioServiceImpl")
public class RolUsuarioServiceImpl implements RolUsuarioService {
	
	@Autowired
	@Qualifier("rolUsuarioRepository")
	private RolUsuarioRepository rolUsuarioRepository;

	@Autowired
	private DozerBeanMapper dozer;
	
	@Override
	public RolUsuarioModel añadirRolUsuario(RolUsuarioModel rolUsuarioModel) {
		RolUsuario rolusuario=transform(rolUsuarioModel);
		return transform(rolUsuarioRepository.save(rolusuario));
	}

	@Override
	public RolUsuario transform(RolUsuarioModel rolUsuarioModel) {
		return dozer.map(rolUsuarioModel, RolUsuario.class);
	}

	@Override
	public RolUsuarioModel transform(RolUsuario rolUsuario) {
		return dozer.map(rolUsuario, RolUsuarioModel.class);
	}

}
