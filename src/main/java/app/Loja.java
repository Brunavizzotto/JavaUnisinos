public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;

    //primeiro construtor
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    //segundo construtor com salario base de -1
    public Loja(String nome, int quantidadeFuncionarios){
        this.nome = nome
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1
    }

    //getter e setter nome
    public String getnome(){
        return nome;
    }

    public void setnome(String nome){
        this.nome = nome;
    }


    //getter e setter quanitdade de funcionario
    public int getquantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }
    
    public void setquantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    //getter e setter salario dos funcionarios
    public double getsalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }

    public void setsalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
}