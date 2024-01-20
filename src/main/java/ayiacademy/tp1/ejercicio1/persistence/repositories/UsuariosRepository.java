package ayiacademy.tp1.ejercicio1.persistence.repositories;

import ayiacademy.tp1.ejercicio1.persistence.entities.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuariosRepository extends CrudRepository<Usuario, Integer> {
    public List<Usuario> findByNombre(String nombre);
}
