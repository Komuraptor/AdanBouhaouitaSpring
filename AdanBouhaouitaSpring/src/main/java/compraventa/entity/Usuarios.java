package compraventa.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="usuarios")
public class Usuarios {

	@Id
	@Column(name="id", length=9)
	private int dni;
	
	@Column(name="nombre", length=20)
	private String nombre;
	
	@Column(name="apellidos", length=35)
	private String apellidos;
	
	@Column(name="fech_nac")
	private Date fech_nac;
	
	@Column(name="fech_alta")
	private Date fech_alta;
	
	@OneToOne
	@JoinColumn(name="id_venta")
	@OnDelete(action=OnDeleteAction.CASCADE)
	private Cuenta email;
	
	@Column(name="telefono", length=9)
	private int telefono;
	
	@Column(name="saldo", length=20)
	private int saldo;

	public Usuarios() {
		super();
	}
	
	public Usuarios(int dni, String nombre, String apellidos, Date fech_nac, Date fech_alta, Cuenta email, int telefono,
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

	public Cuenta getEmail() {
		return email;
	}

	public void setEmail(Cuenta email) {
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
