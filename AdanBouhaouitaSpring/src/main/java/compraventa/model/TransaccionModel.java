package compraventa.model;

import java.util.Date;

public class TransaccionModel {

	private int id;
	
	private CuentaModel id_comprador;
	
	private CuentaModel id_vendedor;
	
	private VendidosModel id_venta;
	
	private Date fech_venta;

	public TransaccionModel() {
		super();
	}

	public TransaccionModel(int id, CuentaModel id_comprador, CuentaModel id_vendedor, VendidosModel id_venta, Date fech_venta) {
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
