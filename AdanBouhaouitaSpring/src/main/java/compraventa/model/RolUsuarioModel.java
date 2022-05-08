package compraventa.model;

public class RolUsuarioModel {

	private int id;
	
	private String rol;
	
	private CuentaModel cuentaModel;
	
	public RolUsuarioModel() {
		super();
	}

	public RolUsuarioModel(int id, String rol, CuentaModel cuentaModel) {
		super();
		this.id = id;
		this.rol = rol;
		this.cuentaModel = cuentaModel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public CuentaModel getUsuario() {
		return cuentaModel;
	}

	public void setUsuario(CuentaModel cuentaModel) {
		this.cuentaModel = cuentaModel;
	}
}
