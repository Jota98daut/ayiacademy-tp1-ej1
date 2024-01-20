package ayiacademy.tp1.ejercicio1.controllers;

import ayiacademy.tp1.ejercicio1.services.ProductosService;
import ayiacademy.tp1.ejercicio1.services.ServiciosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class MainController {
    @Value("${constants.productos}")
    private String tituloProductos;

    @Value("${constants.servicios}")
    private String tituloServicios;

    @Autowired
    private ProductosService productosService;

    @Autowired
    private ServiciosService serviciosService;

    @GetMapping("/")
    public RedirectView getIndex() {
        return new RedirectView("/login");
    }

    @GetMapping("/listado")
    public String getListado(Model model) {
        model.addAttribute("tituloProductos", tituloProductos);
        model.addAttribute("tituloServicios", tituloServicios);
        model.addAttribute("productos", productosService.getAll());
        model.addAttribute("servicios", serviciosService.getAll());
        return "listado";
    }
}
