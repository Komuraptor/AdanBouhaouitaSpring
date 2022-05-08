package compraventa.model;

public class ValoracionesModel {

	private int id;
	
	private UsuariosModel id_comprador;
	
	private UsuariosModel id_vendedor;
	
	private int valoracion;
	
	private String comentario;

	public ValoracionesModel() {
		super();
	}

	public ValoracionesModel(int id, UsuariosModel id_comprador, UsuariosModel id_vendedor, int valoracion, String comentario) {
		super();
		this.id = id;
		this.id_comprador = id_comprador;
		this.id_vendedor = id_vendedor;
		this.valoracion = valoracion;
		this.comentario = comentario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UsuariosModel getId_comprador() {
		return id_comprador;
	}

	public void setId_comprador(UsuariosModel id_comprador) {
		this.id_comprador = id_comprador;
	}

	public UsuariosModel getId_vendedor() {
		return id_vendedor;
	}

	public void setId_vendedor(UsuariosModel id_vendedor) {
		this.id_vendedor = id_vendedor;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
}
