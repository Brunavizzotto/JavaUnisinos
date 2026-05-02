public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){

        if (dataValida(dia, mes, ano)){
                this.dia = dia;
                this.mes = mes;
                this.ano = ano;
            } else {
                System.out.println("Erro, alterar a data para a seguinte data padrão: 1/1/2000.");
                this.dia = 1;
                this.mes = 1;
                this.ano = 2000;
            }
    }

    private boolean dataValida(int dia, int mes, int ano){ //no caso aqui como é booleano só retorna true ou false! 
        if (mes < 1 || mes > 12) return false;
        if (dia < 1 || dia > 31) return false;
        if (ano < 1) return false;

        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //indice zero começa em janeiro e assim vai, lembrar que java começa em 0 engual python

        if (anobissexto(ano)){
            diasMes[1] = 29; //atualiza a lista no 1 (que seria feveireiro) dai ele tem 29 dias
        }

        return dia <= diasMes[mes - 1]; //mes - 1 porque a lista começa em 0, então janeiro é 0, fevereiro é 1 e assim por diante
    }

    public int getDia(){
        return dia;
    }

    public void setDia(int dia){
        if (dataValida(dia, this.mes, this.ano)){
            this.dia = dia;
        } else {
            System.out.println("Erro, alterar a data para a seguinte data padrão: 1/1/2000.");
        }
    }

    public int getMes(){
        return mes;
    }

    public void setMes(int mes){
        if (dataValida(this.dia, mes, this.ano)){
            this.mes = mes;
        }else {
            System.out.println("Erro, alterar a data para a seguinte data padrão: 1/1/2000.");
        }
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        if (dataValida(this.dia, this.mes, ano)){
            this.ano = ano;
        } else {
            System.out.println("Erro, alterar a data para a seguinte data padrão: 1/1/2000.");
        }
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    private boolean anobissexto(int ano){
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
            return true;
        } else {
            return false;
        }
    }

}
