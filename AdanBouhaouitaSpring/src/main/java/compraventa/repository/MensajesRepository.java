package compraventa.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import compraventa.entity.Mensajes;

@Repository("mensajesRepository")
public interface MensajesRepository extends JpaRepository<Mensajes,Serializable>{

}
