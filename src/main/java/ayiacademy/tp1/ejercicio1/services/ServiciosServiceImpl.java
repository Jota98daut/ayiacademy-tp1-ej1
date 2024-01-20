package ayiacademy.tp1.ejercicio1.services;

import ayiacademy.tp1.ejercicio1.persistence.entities.Servicio;
import ayiacademy.tp1.ejercicio1.persistence.repositories.ServiciosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosServiceImpl implements ServiciosService {
    @Autowired
    private ServiciosRepository serviciosRepository;

    @Override
    public Iterable<Servicio> getAll() {
        return serviciosRepository.findAll();
    }
}
