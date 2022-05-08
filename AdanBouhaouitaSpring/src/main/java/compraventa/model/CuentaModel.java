package compraventa.model;

public class CuentaModel {

	private String email;
	
	private String password;
	
	private boolean enabled;
	
	private String rol;

	public CuentaModel() {
		super();
	}

	public CuentaModel(String email, String password, boolean enabled, String rol) {
		super();
		this.email = email;
		this.password = password;
		this.enabled = enabled;
		this.rol = rol;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
	
}
