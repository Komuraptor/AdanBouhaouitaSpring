package compraventa.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cuenta")
public class Cuenta {

	@Id
	@Column(name="email", length=30)
	private String email;
	
	@Column(name="password", length=60)
	private String password;
	
	@Column(name="enabled")
	private boolean enabled;
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="cuenta")
	private Set<RolUsuario> listaRoles = new HashSet<RolUsuario>();

	public Cuenta() {
		super();
	}

	public Cuenta(String email, String password, boolean enabled, Set<RolUsuario> listaRoles) {
		super();
		this.email = email;
		this.password = password;
		this.enabled = enabled;
		this.listaRoles = listaRoles;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Set<RolUsuario> getListaRoles() {
		return listaRoles;
	}

	public void setListaRoles(Set<RolUsuario> listaRoles) {
		this.listaRoles = listaRoles;
	}
	
}
