package ayiacademy.tp1.ejercicio1.controllers;

import ayiacademy.tp1.ejercicio1.persistence.entities.Servicio;
import ayiacademy.tp1.ejercicio1.services.ServiciosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ServiciosController {
    @Autowired
    private ServiciosService serviciosService;

    @GetMapping("/servicios/nuevo")
    public String getNuevoServicio(Model model) {
        model.addAttribute("servicio", new Servicio());
        return "servicios/nuevo";
    }

    @PostMapping("/servicios/nuevo")
    public RedirectView postNuevoServicio(Servicio servicio) {
        serviciosService.save(servicio);
        return new RedirectView("/listado");
    }
}
