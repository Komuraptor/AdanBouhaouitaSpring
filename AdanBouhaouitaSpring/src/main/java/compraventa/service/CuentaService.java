package compraventa.service;

import java.util.List;

import compraventa.entity.Cuenta;
import compraventa.model.CuentaModel;

public interface CuentaService {
	
	public abstract List<CuentaModel> listarCuentas();
	
	public abstract CuentaModel añadirCuenta(CuentaModel cuentaModel);
		
	public abstract boolean compruebaCuenta(String email);
	
	public abstract void save(CuentaModel cuentaModel);
	
	public abstract Cuenta transform(CuentaModel cuentaModel);
	
	public abstract CuentaModel transform(Cuenta cuenta);

}
