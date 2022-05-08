package compraventa.model;

public class VendidosModel {

	private int id;
	
	private ArticulosModel id_articulo;
	
	private UsuariosModel id_comprador;

	public VendidosModel() {
		super();
	}

	public VendidosModel(int id, ArticulosModel id_articulo, UsuariosModel id_comprador) {
		super();
		this.id = id;
		this.id_articulo = id_articulo;
		this.id_comprador = id_comprador;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArticulosModel getId_articulo() {
		return id_articulo;
	}

	public void setId_articulo(ArticulosModel id_articulo) {
		this.id_articulo = id_articulo;
	}

	public UsuariosModel getId_comprador() {
		return id_comprador;
	}

	public void setId_comprador(UsuariosModel id_comprador) {
		this.id_comprador = id_comprador;
	}
	
}
