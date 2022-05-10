package compraventa.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="transaccion")
public class Transaccion {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="id_comprador")
	@OnDelete(action=OnDeleteAction.CASCADE)
	private Cuenta id_comprador;
	
	@ManyToOne
	@JoinColumn(name="id_vendedor")
	@OnDelete(action=OnDeleteAction.CASCADE)
	private Cuenta id_vendedor;
	
	@OneToOne
	@JoinColumn(name="id_venta")
	@OnDelete(action=OnDeleteAction.CASCADE)
	private Vendidos id_venta;
	
	@Column(name="fech_venta")
	private Date fech_venta;

	public Transaccion() {
		super();
	}

	public Transaccion(int id, Cuenta id_comprador, Cuenta id_vendedor, Vendidos id_venta, Date fech_venta) {
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

	public Cuenta getId_comprador() {
		return id_comprador;
	}

	public void setId_comprador(Cuenta id_comprador) {
		this.id_comprador = id_comprador;
	}

	public Cuenta getId_vendedor() {
		return id_vendedor;
	}

	public void setId_vendedor(Cuenta id_vendedor) {
		this.id_vendedor = id_vendedor;
	}

	public Vendidos getId_venta() {
		return id_venta;
	}

	public void setId_venta(Vendidos id_venta) {
		this.id_venta = id_venta;
	}

	public Date getFech_venta() {
		return fech_venta;
	}

	public void setFech_venta(Date fech_venta) {
		this.fech_venta = fech_venta;
	}
	
}
