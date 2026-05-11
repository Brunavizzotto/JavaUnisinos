package unisinos.etapa2;

public class Produto {
    private String nome;
    private double preco;

    //etapa 2
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }   

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    //etapa 2
    public Data getDataValidade() {
    return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
    return "Produto: " + nome + "\n" +
           "Preço: " + preco;
    }

 }

