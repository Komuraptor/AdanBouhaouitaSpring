package compraventa.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import compraventa.entity.Usuarios;

@Repository("usuariosRepository")
public interface UsuariosRepository extends JpaRepository<Usuarios, Serializable> {

	
}
