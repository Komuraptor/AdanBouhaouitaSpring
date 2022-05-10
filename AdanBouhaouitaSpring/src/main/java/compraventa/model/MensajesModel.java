package compraventa.model;

public class MensajesModel {

private int id;
	
	private CuentaModel id_emisor;
	
	private CuentaModel id_receptor;
	
	private String mensaje;

	public MensajesModel() {
		super();
	}

	public MensajesModel(int id, CuentaModel id_emisor, CuentaModel id_receptor, String mensaje) {
		super();
		this.id = id;
		this.id_emisor = id_emisor;
		this.id_receptor = id_receptor;
		this.mensaje = mensaje;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CuentaModel getId_emisor() {
		return id_emisor;
	}

	public void setId_emisor(CuentaModel id_emisor) {
		this.id_emisor = id_emisor;
	}

	public CuentaModel getId_receptor() {
		return id_receptor;
	}

	public void setId_receptor(CuentaModel id_receptor) {
		this.id_receptor = id_receptor;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
