package compraventa.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import compraventa.entity.Mensajes;
import compraventa.model.MensajesModel;
import compraventa.repository.MensajesRepository;
import compraventa.service.MensajesService;

@Service("mensajesServiceImpl")
public class MensajesServiceImpl implements MensajesService {
	
	@Autowired
	@Qualifier("mensajesRepository")
	private MensajesRepository mensajesRepository;
	
	@Autowired
	private DozerBeanMapper dozer;

	@Override
	public List<MensajesModel> listarMensajes() {
		List<Mensajes> listaM = mensajesRepository.findAll();
		List<MensajesModel> listaMM = new ArrayList<>();
		listaM.forEach(m->{
			MensajesModel mensajesModel=transform(m);
			listaMM.add(mensajesModel);
		});
		Collections.sort(listaMM, (MensajesModel c1, MensajesModel c2) -> c1.getMensaje().compareTo(c2.getMensaje()));
		
		return listaMM;
	}

	@Override
	public MensajesModel añadirMensaje(MensajesModel mensajesModel) {
		Mensajes mensajes = transform(mensajesModel);
		return transform(mensajesRepository.save(mensajes));
	}

	@Override
	public int eliminarMensaje(int id) {
		mensajesRepository.deleteById(id);
		return 0;
	}

	@Override
	public Mensajes transform(MensajesModel mensajesModel) {
		return dozer.map(mensajesModel, Mensajes.class);
	}

	@Override
	public MensajesModel transform(Mensajes mensajes) {
		return dozer.map(mensajes, MensajesModel.class);
	}

}
