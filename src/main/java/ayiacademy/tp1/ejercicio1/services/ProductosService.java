package ayiacademy.tp1.ejercicio1.services;

import ayiacademy.tp1.ejercicio1.persistence.entities.Producto;

public interface ProductosService {
    Iterable<Producto> getAll();

    void save(Producto producto);

    void delete(int id);

    boolean exists(int id);
}
