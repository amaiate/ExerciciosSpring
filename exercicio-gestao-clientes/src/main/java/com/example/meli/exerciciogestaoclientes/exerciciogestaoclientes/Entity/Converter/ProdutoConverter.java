package com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Entity.Converter;

import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.DTO.ProdutoDTO;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Entity.Produtos;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Form.ProdutoForm;
import com.example.meli.exerciciogestaoclientes.exerciciogestaoclientes.Utils.GeradorId;

import java.util.ArrayList;
import java.util.List;

public class ProdutoConverter {

    public static Produtos produtoFormToEntity(ProdutoForm produtoForm) {
        return new Produtos(
                GeradorId.getProximo(),
                produtoForm.getDescricao(),
                produtoForm.getCor(),
                produtoForm.getQuantidade(),
                produtoForm.getPreco()

        );
    }

    public static List<Produtos> produtoFormToEntity(List<ProdutoForm> produtoForms) {
        List<Produtos> produtos = new ArrayList<>();

        for (ProdutoForm produtoForm : produtoForms) {
            produtos.add(produtoFormToEntity(produtoForm));
        }

        return produtos;
    }

    public static ProdutoDTO produtoEntityToDTO(Produtos produto) {
        return new ProdutoDTO(
                produto.getDescricao(),
                produto.getCor(),
                produto.getQuantidade(),
                produto.getPreco()
        );
    }

    public static List<ProdutoDTO> produtoEntityToDTO(List<Produtos> produtos) {
        List<ProdutoDTO> produtoDTOS = new ArrayList<>();

        for (Produtos produto : produtos) {
            produtoDTOS.add(produtoEntityToDTO(produto));
        }

        return produtoDTOS;
    }

    public static ProdutoDTO entityToProdutoDTO(Produtos produto) {
        return new ProdutoDTO(
                produto.getDescricao(),
                produto.getCor(),
                produto.getQuantidade(),
                produto.getPreco()
        );
    }

    public static List<ProdutoDTO> entityToProdutoDTO(List<Produtos> produtos) {
        List<ProdutoDTO> produtoDTOS = new ArrayList<>();

        for (Produtos produto : produtos) {
            produtoDTOS.add(entityToProdutoDTO(produto));
        }

        return produtoDTOS;
    }
}
