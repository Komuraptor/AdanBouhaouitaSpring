package compraventa.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import compraventa.entity.Transaccion;

@Repository("transaccionRepository")
public interface TransaccionRepository extends JpaRepository<Transaccion,Serializable>{

}
