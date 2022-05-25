package compraventa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="articulos")
public class Articulos {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	@OnDelete(action=OnDeleteAction.CASCADE)
	private Cuenta id_usuario;

	@Column(name="nombre", length=50)
	private String nombre;
	
	@Column(name="descripcion", length=150)
	private String descripcion;
	
	@Column(name="precio", length=10)
	private int precio;
	
	@Column(name="imagen", length=50)
	private String imagen;
	
	@Column(name="categoria", length=50)
	private String categoria;
	
	@Column(name="vendido")
	private boolean vendido;

	public Articulos() {
		super();
	}

	public Articulos(int id, Cuenta id_usuario, String nombre, String descripcion, int precio, String imagen, String categoria,
			boolean vendido) {
		super();
		this.id = id;
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.imagen = imagen;
		this.categoria = categoria;
		this.vendido = vendido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cuenta getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Cuenta id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getdescripcion() {
		return descripcion;
	}

	public void setdescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public boolean isVendido() {
		return vendido;
	}

	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}

}
