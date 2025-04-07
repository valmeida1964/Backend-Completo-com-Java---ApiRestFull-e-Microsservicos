package br.com.sigrid.primeiro_exemplo.Model;

public class Produto {

    //#region Atributos
    private Long id;

    private String nome;
    
    private Integer quantidade;
    
    private Double valor;
    
    private String observacao;
    //#endregion
    
    //#region

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
//#endregion


    
}
