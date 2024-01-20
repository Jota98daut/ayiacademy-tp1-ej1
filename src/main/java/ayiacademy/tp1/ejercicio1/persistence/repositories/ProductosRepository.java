package ayiacademy.tp1.ejercicio1.persistence.repositories;

import ayiacademy.tp1.ejercicio1.persistence.entities.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepository extends CrudRepository<Producto, String> {}
