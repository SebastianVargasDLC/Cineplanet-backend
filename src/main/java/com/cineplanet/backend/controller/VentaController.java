package com.cineplanet.backend.controller;

import com.cineplanet.backend.model.Ventas;
import com.cineplanet.backend.service.VentaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cineplanet-venta")
public class VentaController {
    private static Logger logger =
            LoggerFactory.getLogger(PeliculaController.class);
    private final VentaService service;
    public VentaController(VentaService service) {
        this.service = service;
    }

    @GetMapping(path = "/ventas")
    public List<Ventas> getVentas() {
        logger.info("Consultando Ventass");
        return service.getVentas();
    }
}
