package compraventa.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import compraventa.entity.Articulos;
import compraventa.model.ArticulosModel;
import compraventa.repository.ArticulosRepository;
import compraventa.service.ArticulosService;

@Service("articulosServiceImpl")
public class ArticulosServiceImpl implements ArticulosService {

	@Autowired
	@Qualifier("articulosRepository")
	private ArticulosRepository articulosRepository;
	
	@Autowired
	private DozerBeanMapper dozer;
	
	@Override
	public List<ArticulosModel> listarArticulos() {
		List<Articulos> listaA = articulosRepository.findAll();
		List<ArticulosModel> listaAM = new ArrayList<>();
		listaA.forEach(a->{
			ArticulosModel articulosModel=transform(a);
			listaAM.add(articulosModel);
		});
		Collections.sort(listaAM, (ArticulosModel a1, ArticulosModel a2) -> a1.getNombre().compareTo(a2.getNombre()));
		
		return listaAM;
	}

	@Override
	public ArticulosModel añadirArticulo(ArticulosModel articulosModel) {
		Articulos articulos = transform(articulosModel);
		return transform(articulosRepository.save(articulos));
	}

	@Override
	public int eliminarArticulo(int id) {
		articulosRepository.deleteById(id);
		return 0;
	}

	@Override
	public ArticulosModel actualizarArticulos(ArticulosModel articulosModel) {
		Articulos articulos = transform(articulosModel);
		return transform(articulosRepository.save(articulos));
	}

	@Override
	public Articulos transform(ArticulosModel articulosModel) {
		return dozer.map(articulosModel, Articulos.class);
	}

	@Override
	public ArticulosModel transform(Articulos articulos) {
		return dozer.map(articulos, ArticulosModel.class);
	}
}
