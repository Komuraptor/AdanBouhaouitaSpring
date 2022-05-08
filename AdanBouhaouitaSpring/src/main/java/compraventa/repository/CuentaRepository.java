package compraventa.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import compraventa.entity.Cuenta;

@Repository("cuentaRepository")
public interface CuentaRepository extends JpaRepository<Cuenta,Serializable> {

	public abstract Cuenta findByEmail(String email);
	
}
