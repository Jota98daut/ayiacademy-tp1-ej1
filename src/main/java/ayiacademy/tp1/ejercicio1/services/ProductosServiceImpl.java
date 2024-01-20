package ayiacademy.tp1.ejercicio1.services;

import ayiacademy.tp1.ejercicio1.persistence.entities.Producto;
import ayiacademy.tp1.ejercicio1.persistence.repositories.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductosServiceImpl implements ProductosService {
    @Autowired
    private ProductosRepository productosRepository;

    @Override
    public Iterable<Producto> getAll() {
        return productosRepository.findAll();
    }
}
