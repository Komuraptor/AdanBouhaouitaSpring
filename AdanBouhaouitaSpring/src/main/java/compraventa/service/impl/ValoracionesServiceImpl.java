package compraventa.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import compraventa.entity.Valoraciones;
import compraventa.model.ValoracionesModel;
import compraventa.repository.ValoracionesRepository;
import compraventa.service.ValoracionesService;

@Service("valoracionesServiceImpl")
public class ValoracionesServiceImpl implements ValoracionesService {
	
	@Autowired
	@Qualifier("valoracionesRepository")
	private ValoracionesRepository valoracionesRepository;
	
	@Autowired
	private DozerBeanMapper dozer;

	@Override
	public List<ValoracionesModel> listarValoraciones() {
		List<Valoraciones> listaV = valoracionesRepository.findAll();
		List<ValoracionesModel> listaVM = new ArrayList<>();
		listaV.forEach(v->{
			ValoracionesModel valoracionesModel=transform(v);
			listaVM.add(valoracionesModel);
		});
		
		return listaVM;
	}

	@Override
	public ValoracionesModel añadirValoracion(ValoracionesModel valoracionesModel) {
		Valoraciones valoraciones = transform(valoracionesModel);
		return transform(valoracionesRepository.save(valoraciones));
	}

	@Override
	public Valoraciones transform(ValoracionesModel valoracionesModel) {
		return dozer.map(valoracionesModel, Valoraciones.class);
	}

	@Override
	public ValoracionesModel transform(Valoraciones valoraciones) {
		return dozer.map(valoraciones, ValoracionesModel.class);
	}

}
