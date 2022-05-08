package compraventa.entity;

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
@Table(name="vendidos")
public class Vendidos {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@OneToOne
	@JoinColumn(name="id_articulo")
	@OnDelete(action=OnDeleteAction.CASCADE)
	private Articulos id_articulo;
	
	@ManyToOne
	@JoinColumn(name="id_comprador")
	@OnDelete(action=OnDeleteAction.CASCADE)
	private Usuarios id_comprador;

	public Vendidos() {
		super();
	}

	public Vendidos(int id, Articulos id_articulo, Usuarios id_comprador) {
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

	public Articulos getId_articulo() {
		return id_articulo;
	}

	public void setId_articulo(Articulos id_articulo) {
		this.id_articulo = id_articulo;
	}

	public Usuarios getId_comprador() {
		return id_comprador;
	}

	public void setId_comprador(Usuarios id_comprador) {
		this.id_comprador = id_comprador;
	}

}
