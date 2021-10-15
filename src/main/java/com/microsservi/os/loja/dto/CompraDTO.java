package com.microsservi.os.loja.dto;

import java.util.List;

public class CompraDTO {

    private List<ItemDaCompraDTO> itens;

    private EnderecoDTO endereço;

    public List<ItemDaCompraDTO> getItens() {
        return itens;
    }

    public void setItens(List<ItemDaCompraDTO> itens) {
        this.itens = itens;
    }

    public EnderecoDTO getEndereço() {
        return endereço;
    }

    public void setEndereço(EnderecoDTO endereço) {
        this.endereço = endereço;
    }
}
