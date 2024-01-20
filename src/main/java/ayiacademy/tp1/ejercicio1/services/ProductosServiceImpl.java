package ayiacademy.tp1.ejercicio1.services;

import ayiacademy.tp1.ejercicio1.persistence.entities.Producto;
import ayiacademy.tp1.ejercicio1.persistence.repositories.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductosServiceImpl implements ProductosService {
    @Autowired
    private ProductosRepository productosRepository;

    @Transactional(readOnly = true)
    @Override
    public Iterable<Producto> getAll() {
        return productosRepository.findAll();
    }

    @Transactional
    @Override
    public void save(Producto producto) {
        productosRepository.save(producto);
    }

    @Transactional
    @Override
    public void delete(int id) {
        productosRepository.deleteById(id);
    }

    @Override
    public boolean exists(int id) {
        return productosRepository.existsById(id);
    }
}
