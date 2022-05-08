package compraventa.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import compraventa.entity.Transaccion;
import compraventa.model.TransaccionModel;
import compraventa.repository.TransaccionRepository;
import compraventa.service.TransaccionService;

@Service("transaccionServiceImpl")
public class TransaccionServiceImpl implements TransaccionService {
	
	@Autowired
	@Qualifier("transaccionRepository")
	private TransaccionRepository transaccionRepository;
	
	@Autowired
	private DozerBeanMapper dozer;

	@Override
	public List<TransaccionModel> listarTransacciones() {
		List<Transaccion> listaT = transaccionRepository.findAll();
		List<TransaccionModel> listaTM = new ArrayList<>();
		listaT.forEach(t->{
			TransaccionModel TransaccionsModel=transform(t);
			listaTM.add(TransaccionsModel);
		});
		
		return listaTM;
	}

	@Override
	public TransaccionModel añadirTransaccion(TransaccionModel transaccionModel) {
		Transaccion transaccion = transform(transaccionModel);
		return transform(transaccionRepository.save(transaccion));
	}

	@Override
	public Transaccion transform(TransaccionModel transaccionModel) {
		return dozer.map(transaccionModel, Transaccion.class);
	}

	@Override
	public TransaccionModel transform(Transaccion transaccion) {
		return dozer.map(transaccion, TransaccionModel.class);
	}

}
