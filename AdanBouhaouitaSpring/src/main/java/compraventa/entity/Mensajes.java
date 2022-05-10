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
@Table(name="mensajes")
public class Mensajes {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="id_emisor")
	@OnDelete(action=OnDeleteAction.CASCADE)
	private Cuenta id_emisor;
	
	@ManyToOne
	@JoinColumn(name="id_receptor")
	@OnDelete(action=OnDeleteAction.CASCADE)
	private Cuenta id_receptor;
	
	@Column(name="mensaje", length=300)
	private String mensaje;

	public Mensajes() {
		super();
	}

	public Mensajes(int id, Cuenta id_emisor, Cuenta id_receptor, String mensaje) {
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

	public Cuenta getId_emisor() {
		return id_emisor;
	}

	public void setId_emisor(Cuenta id_emisor) {
		this.id_emisor = id_emisor;
	}

	public Cuenta getId_receptor() {
		return id_receptor;
	}

	public void setId_receptor(Cuenta id_receptor) {
		this.id_receptor = id_receptor;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
