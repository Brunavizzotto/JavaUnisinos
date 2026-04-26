

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    
    //CONSTRUTORES 
    //Aqui recebe os parametros para atributos da classe
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
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

    public double gastosComSalarios(){
        if (salarioBaseFuncionario == -1){  //Quando for chamado o metodo, se n tiver definido retorna -1
            return -1;
        }
        return quantidadeFuncionarios * salarioBaseFuncionario;
    }
    
    public int tamanhoDaLoja(){
        
    }
}