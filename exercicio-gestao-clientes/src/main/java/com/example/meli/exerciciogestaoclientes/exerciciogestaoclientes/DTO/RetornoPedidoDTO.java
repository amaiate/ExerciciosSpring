package com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.DTO;

import java.util.List;

public class RetornoPedidoDTO {

    private List<ProdutoDTO> produtos;
    private Double total;

    public RetornoPedidoDTO(List<ProdutoDTO> produtos, Double total) {
        this.produtos = produtos;
        this.total = total;
    }

    public RetornoPedidoDTO() {
    }

    public List<ProdutoDTO> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoDTO> produtos) {
        this.produtos = produtos;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
