package compraventa.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import compraventa.entity.Vendidos;
import compraventa.model.VendidosModel;
import compraventa.repository.VendidosRepository;
import compraventa.service.VendidosService;

@Service("vendidosServiceImpl")
public class VendidosServiceImpl implements VendidosService {
	
	@Autowired
	@Qualifier("vendidosRepository")
	private VendidosRepository vendidosRepository;
	
	@Autowired
	private DozerBeanMapper dozer;

	@Override
	public List<VendidosModel> listarVendidos() {
		List<Vendidos> listaV = vendidosRepository.findAll();
		List<VendidosModel> listaVM = new ArrayList<>();
		listaV.forEach(v->{
			VendidosModel vendidosModel=transform(v);
			listaVM.add(vendidosModel);
		});
		return null;
	}

	@Override
	public VendidosModel añadirVendido(VendidosModel vendidosModel) {
		Vendidos vendidos = transform(vendidosModel);
		return transform(vendidosRepository.save(vendidos));
	}

	@Override
	public int eliminarVendido(int id) {
		vendidosRepository.deleteById(id);
		return 0;
	}

	@Override
	public VendidosModel actualizarVendidos(VendidosModel vendidosModel) {
		Vendidos vendidos = transform(vendidosModel);
		return transform(vendidosRepository.save(vendidos));
	}

	@Override
	public Vendidos transform(VendidosModel vendidosModel) {
		return dozer.map(vendidosModel, Vendidos.class);
	}

	@Override
	public VendidosModel transform(Vendidos vendidos) {
		return dozer.map(vendidos, VendidosModel.class);
	}

}
