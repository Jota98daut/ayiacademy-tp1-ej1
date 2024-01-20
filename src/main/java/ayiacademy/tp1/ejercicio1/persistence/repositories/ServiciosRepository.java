package ayiacademy.tp1.ejercicio1.persistence.repositories;

import ayiacademy.tp1.ejercicio1.persistence.entities.Servicio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiciosRepository extends CrudRepository<Servicio, Integer> {
}
