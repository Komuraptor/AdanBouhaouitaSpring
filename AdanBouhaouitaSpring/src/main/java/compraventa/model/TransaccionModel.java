package compraventa.model;

import java.util.Date;

public class TransaccionModel {

	private int id;
	
	private UsuariosModel id_comprador;
	
	private UsuariosModel id_vendedor;
	
	private VendidosModel id_venta;
	
	private Date fech_venta;

	public TransaccionModel() {
		super();
	}

	public TransaccionModel(int id, UsuariosModel id_comprador, UsuariosModel id_vendedor, VendidosModel id_venta, Date fech_venta) {
		super();
		this.id = id;
		this.id_comprador = id_comprador;
		this.id_vendedor = id_vendedor;
		this.id_venta = id_venta;
		this.fech_venta = fech_venta;
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

	public VendidosModel getId_venta() {
		return id_venta;
	}

	public void setId_venta(VendidosModel id_venta) {
		this.id_venta = id_venta;
	}

	public Date getFech_venta() {
		return fech_venta;
	}

	public void setFech_venta(Date fech_venta) {
		this.fech_venta = fech_venta;
	}
	
}
