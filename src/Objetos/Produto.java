package Objetos;

public class Produto {
    //ATRIBUTOS
    private int codigoProduto;
    private String descricao = "";
    private String categoria = "";
    private String tamanho = "";
    private String fornecedor = "";
    private float precoCusto;
    private float precoVenda;
    
    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public float getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }
    
    public void limpaProduto(){
        codigoProduto = 0;
        descricao = "";
        categoria = "";
        tamanho = "";
        fornecedor = "";
        precoCusto = 0;
        precoVenda = 0;
    }
    
}