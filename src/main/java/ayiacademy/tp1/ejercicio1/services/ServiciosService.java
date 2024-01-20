package ayiacademy.tp1.ejercicio1.services;

import ayiacademy.tp1.ejercicio1.persistence.entities.Servicio;

public interface ServiciosService {
    Iterable<Servicio> getAll();

    void save(Servicio servicio);

    void delete(int id);
}
