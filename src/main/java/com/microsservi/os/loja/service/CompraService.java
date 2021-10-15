package com.microsservi.os.loja.service;

import com.microsservi.os.loja.dto.CompraDTO;
import com.microsservi.os.loja.dto.InfoFornecedorDTO;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompraService {

    public void realizaCompra(CompraDTO compra) {

        RestTemplate client = new RestTemplate();
        ResponseEntity<InfoFornecedorDTO> exchange =
                client.exchange("http://localhost8090/info" + compra.getEndereço().getEstado(),
                HttpMethod.GET, null, InfoFornecedorDTO.class);

        System.out.println(exchange.getBody().getEndereco());

    }

}
