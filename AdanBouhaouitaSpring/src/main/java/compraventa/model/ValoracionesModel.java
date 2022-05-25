package compraventa.model;

public class ValoracionesModel {

	private int id;
	
	private CuentaModel id_comprador;
	
	private CuentaModel id_vendedor;
	
	private int valoracion;
	
	private String comentario;

	public ValoracionesModel() {
		super();
	}

	public ValoracionesModel(int id, CuentaModel id_comprador, CuentaModel id_vendedor, int valoracion, String comentario) {
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

	public CuentaModel getId_comprador() {
		return id_comprador;
	}

	public void setId_comprador(CuentaModel id_comprador) {
		this.id_comprador = id_comprador;
	}

	public CuentaModel getId_vendedor() {
		return id_vendedor;
	}

	public void setId_vendedor(CuentaModel id_vendedor) {
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
