package compraventa.model;

public class ArticulosModel {
	
	private int id;
	
	private CuentaModel id_usuario;

	private String nombre;
	
	private String descripcion;
	
	private int precio;
	
	private String imagen;
	
	private String categoria;
	
	private boolean vendido;

	public ArticulosModel() {
		super();
	}

	public ArticulosModel(int id, CuentaModel id_usuario, String nombre, String descripcion, int precio, String imagen, String categoria,
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

	public CuentaModel getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(CuentaModel id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
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
