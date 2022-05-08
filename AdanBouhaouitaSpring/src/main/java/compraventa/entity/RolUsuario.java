package compraventa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="rol_usuario", uniqueConstraints=@UniqueConstraint(columnNames= {"rol","email"}))
public class RolUsuario {

	@Id
	@GeneratedValue
	@Column(name="id", unique=true, nullable=false)
	private int id;
	
	@Column
	private String rol;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="email", nullable=false)
	private Cuenta cuenta;
	
	public RolUsuario() {
		super();
	}

	public RolUsuario(int id, String rol, Cuenta cuenta) {
		super();
		this.id = id;
		this.rol = rol;
		this.cuenta = cuenta;
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

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
}
