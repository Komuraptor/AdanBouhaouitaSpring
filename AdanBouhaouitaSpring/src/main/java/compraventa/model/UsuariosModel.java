package compraventa.model;

import java.util.Date;

public class UsuariosModel {

	private int dni;
	
	private String nombre;
	
	private String apellidos;
	
	private Date fech_nac;
	
	private Date fech_alta;
	
	private CuentaModel email;
	
	private int telefono;
	
	private int saldo;

	public UsuariosModel() {
		super();
	}
	
	public UsuariosModel(int dni, String nombre, String apellidos, Date fech_nac, Date fech_alta, CuentaModel email, int telefono,
			int saldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fech_nac = fech_nac;
		this.fech_alta = fech_alta;
		this.email = email;
		this.telefono = telefono;
		this.saldo = saldo;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
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

	public Date getFech_nac() {
		return fech_nac;
	}

	public void setFech_nac(Date fech_nac) {
		this.fech_nac = fech_nac;
	}

	public Date getFech_alta() {
		return fech_alta;
	}

	public void setFech_alta(Date fech_alta) {
		this.fech_alta = fech_alta;
	}

	public CuentaModel getEmail() {
		return email;
	}

	public void setEmail(CuentaModel email) {
		this.email = email;
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
	
}
