package compraventa.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import compraventa.entity.Valoraciones;

@Repository("valoracionesRepository")
public interface ValoracionesRepository extends JpaRepository<Valoraciones,Serializable> {

}
