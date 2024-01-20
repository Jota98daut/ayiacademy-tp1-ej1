package ayiacademy.tp1.ejercicio1.services;

import ayiacademy.tp1.ejercicio1.persistence.entities.Servicio;
import ayiacademy.tp1.ejercicio1.persistence.repositories.ServiciosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiciosServiceImpl implements ServiciosService {
    @Autowired
    private ServiciosRepository serviciosRepository;

    @Transactional(readOnly = true)
    @Override
    public Iterable<Servicio> getAll() {
        return serviciosRepository.findAll();
    }

    @Transactional
    @Override
    public void save(Servicio servicio) {
        serviciosRepository.save(servicio);
    }

    @Transactional
    @Override
    public void delete(int id) {
        serviciosRepository.deleteById(id);
    }
}
