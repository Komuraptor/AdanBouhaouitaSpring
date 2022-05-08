package compraventa.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import compraventa.entity.Vendidos;

@Repository("vendidosRepository")
public interface VendidosRepository extends JpaRepository<Vendidos,Serializable> {

}
