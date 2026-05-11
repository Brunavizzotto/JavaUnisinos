package unisinos.etapa2;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;

    //novos atributos pra etapa 2
    private Endereco endereco;
    private Data dataFundacao;
    
    //CONSTRUTORES 
    //Aqui recebe os parametros para atributos da classe
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    //esse aqui recebe o valor do salario como -1 (porque não foi definido ainda)
    public Loja(String nome, int quantidadeFuncionarios){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
    }

    //METODOS DE ACESSO:
    //getter e setter nome
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){  //lembra que o void não retorna nada, só executar a ação
        this.nome = nome;
    }

    //getter e setter quanitdade de funcionario
    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }
    
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    //getter e setter salario dos funcionarios
    public double getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    //METODO toString
    @Override
    public String toString(){
        return "Loja: " + nome + "\n" +
               "Quantidade de Funcionarios: " + quantidadeFuncionarios + "\n" +
               "Salario Base do Funcionario: " + salarioBaseFuncionario;
    }

    public double gastosComSalario(){
        if (salarioBaseFuncionario == -1){  //Quando for chamado o metodo, se n tiver definido retorna -1
            return -1;
        }
        return quantidadeFuncionarios * salarioBaseFuncionario;
    }
    
    public int tamanhoDaLoja(){
        if (quantidadeFuncionarios < 10) {
            return 'P';
        }else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
            return 'M';
        }else {
            return 'G';
        }

        
    }
}