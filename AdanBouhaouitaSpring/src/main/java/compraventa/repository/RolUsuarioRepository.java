package compraventa.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import compraventa.entity.RolUsuario;


@Repository("rolUsuarioRepository")
public interface RolUsuarioRepository extends JpaRepository<RolUsuario,Serializable> {

}
