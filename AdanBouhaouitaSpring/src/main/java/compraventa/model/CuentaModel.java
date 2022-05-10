package compraventa.model;

import java.util.Date;

public class CuentaModel {

	private String email;
	
	private String password;
	
	private String dni;
	
	private String nombre;
	
	private String apellidos;
	
	private String fech_nac;
	
	private Date fech_alta;
	
	private int telefono;
	
	private int saldo;
	
	private boolean enabled;
	
	private String rol;

	public CuentaModel() {
		super();
	}

	public CuentaModel(String email, String password, String dni, String nombre, String apellidos, String fech_nac,
			Date fech_alta, int telefono, int saldo, boolean enabled, String rol) {
		super();
		this.email = email;
		this.password = password;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fech_nac = fech_nac;
		this.fech_alta = fech_alta;
		this.telefono = telefono;
		this.saldo = saldo;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFech_nac() {
		return fech_nac;
	}

	public void setFech_nac(String fech_nac) {
		this.fech_nac = fech_nac;
	}

	public Date getFech_alta() {
		return fech_alta;
	}

	public void setFech_alta(Date fech_alta) {
		this.fech_alta = fech_alta;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
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
