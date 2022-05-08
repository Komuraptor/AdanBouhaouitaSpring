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
@Table(name="valoraciones")
public class Valoraciones {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="id_comprador")
	@OnDelete(action=OnDeleteAction.CASCADE)
	private Usuarios id_comprador;
	
	@ManyToOne
	@JoinColumn(name="id_vendedor")
	@OnDelete(action=OnDeleteAction.CASCADE)
	private Usuarios id_vendedor;
	
	@Column(name="valoracion", length=1)
	private int valoracion;
	
	@Column(name="comentario", length=150)
	private String comentario;

	public Valoraciones() {
		super();
	}

	public Valoraciones(int id, Usuarios id_comprador, Usuarios id_vendedor, int valoracion, String comentario) {
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

	public Usuarios getId_comprador() {
		return id_comprador;
	}

	public void setId_comprador(Usuarios id_comprador) {
		this.id_comprador = id_comprador;
	}

	public Usuarios getId_vendedor() {
		return id_vendedor;
	}

	public void setId_vendedor(Usuarios id_vendedor) {
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
