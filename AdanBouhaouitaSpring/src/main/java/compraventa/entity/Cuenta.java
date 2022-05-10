package compraventa.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cuenta")
public class Cuenta {

	@Id
	@Column(name="email", length=30)
	private String email;
	
	@Column(name="password", length=60)
	private String password;
	
	@Column(name="dni", unique=true, length=9)
	private String dni;
	
	@Column(name="nombre", length=20)
	private String nombre;
	
	@Column(name="apellidos", length=35)
	private String apellidos;
	
	@Column(name="fech_nac")
	private String fech_nac;
	
	@Column(name="fech_alta")
	private Date fech_alta;
	
	@Column(name="telefono", length=9)
	private int telefono;
	
	@Column(name="saldo", length=20)
	private int saldo;
	
	@Column(name="enabled")
	private boolean enabled;
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="cuenta")
	private Set<RolUsuario> listaRoles = new HashSet<RolUsuario>();

	public Cuenta() {
		super();
	}

	public Cuenta(String email, String password, String dni, String nombre, String apellidos, String fech_nac,
			Date fech_alta, int telefono, int saldo, boolean enabled, Set<RolUsuario> listaRoles) {
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
		this.listaRoles = listaRoles;
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

	public Set<RolUsuario> getListaRoles() {
		return listaRoles;
	}

	public void setListaRoles(Set<RolUsuario> listaRoles) {
		this.listaRoles = listaRoles;
	}

	
	
}
