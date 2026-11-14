package com.cineplanet.backend.controller;

import com.cineplanet.backend.model.Cine;
import com.cineplanet.backend.service.CineService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cineplanet-cine")
public class CineController {
    private static Logger logger =
            LoggerFactory.getLogger(PeliculaController.class);
    private final CineService service;
    public CineController(CineService service) {
        this.service = service;
    }

    @GetMapping(path = "/cines")
    public List<Cine> getCines() {
        logger.info("Consultando Cines");
        return service.getCines();
    }
}
