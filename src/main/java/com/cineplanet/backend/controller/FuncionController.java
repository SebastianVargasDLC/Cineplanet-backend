package com.cineplanet.backend.controller;

import com.cineplanet.backend.model.Funcion;
import com.cineplanet.backend.service.FuncionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cineplanet-funcion")
public class FuncionController {
    private static Logger logger =
            LoggerFactory.getLogger(PeliculaController.class);
    private final FuncionService service;

    public FuncionController(FuncionService service){
        this.service = service;
    }

    @GetMapping(path = "/funciones")
    public List<Funcion> getFunciones() {
        logger.info("Consultando Funciones");
        return service.getFunciones();
    }
}
