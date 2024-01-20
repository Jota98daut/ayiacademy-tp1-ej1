package ayiacademy.tp1.ejercicio1.controllers;

import ayiacademy.tp1.ejercicio1.persistence.entities.Producto;
import ayiacademy.tp1.ejercicio1.services.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ProductosController {
    @Autowired
    private ProductosService productosService;

    @GetMapping("/productos/nuevo")
    public String getNuevoProducto(Model model) {
        model.addAttribute("producto", new Producto());
        return "productos/nuevo";
    }

    @PostMapping("/productos/nuevo")
    public RedirectView postNuevoProducto(Producto producto) {
        productosService.save(producto);
        return new RedirectView("/listado");
    }

    @GetMapping("/productos/eliminar/{id}")
    public RedirectView getEliminarProducto(@PathVariable int id) {
        productosService.delete(id);
        return new RedirectView("/listado");
    }
}
