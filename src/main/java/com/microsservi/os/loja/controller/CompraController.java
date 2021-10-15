package com.microsservi.os.loja.controller;

import com.microsservi.os.loja.dto.CompraDTO;
import com.microsservi.os.loja.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/compra")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void realizaCompra(@RequestBody CompraDTO compra) {
        compraService.realizaCompra(compra);
    }

}
