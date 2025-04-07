package br.com.sigrid.primeiro_exemplo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import br.com.sigrid.primeiro_exemplo.Model.Produto;

@Repository
public class ProdutoRepository {

    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private Integer ultimoId = 0;

    public List<Produto> obterTodos() {
        return produtos;
    }
}
