package com.cineplanet.backend.controller;

import com.cineplanet.backend.model.Pelicula;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import com.cineplanet.backend.service.PeliculaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cineplanet-pelicula")
public class PeliculaController {
    private static Logger logger =
            LoggerFactory.getLogger(PeliculaController.class);
    private final PeliculaService service;
    public PeliculaController(PeliculaService service){
        this.service = service;
    }

    @GetMapping(path = "/peliculas")
    public List<Pelicula> getPeliculas() {
        logger.info("Consultando Peliculas");
        return service.getPeliculas();
    }
}
