package compraventa.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import compraventa.entity.Articulos;

@Repository("articulosRepository")
public interface ArticulosRepository extends JpaRepository<Articulos,Serializable>{

}
