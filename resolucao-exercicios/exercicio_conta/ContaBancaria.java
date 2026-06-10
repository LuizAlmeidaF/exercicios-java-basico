package exercicio_conta;

public class ContaBancaria {
    String name;
    String conta;
    String agencia;
    double saldo;

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    double chequeEspecial(double saldo){
        double valorCEspecial;

        if (saldo <= 500.0) {
            valorCEspecial = 50.0;
        } else {
            valorCEspecial = saldo * 0.5;
        }return valorCEspecial;
    }

    double saldoReal(double num1, double num2){
        return num1 + num2;
    }

    void consultarSaldo(double num1, double num2){

        double ce = num2 - num1;
        System.out.println(String.format("Seu saldo atual é: %s sendo %s de saldo da conta e %s de cheque especial.\n", num2, num1, ce));
    }

    double depositar(double num1, double num2){
        double total = num1 + num2;
        System.out.println(String.format("Seu depósito de %s foi realizado.", num1));
        return  total;
    }

    double sacarDinheiro(double saque, double saldo){
        double total = saldo - saque;
        System.out.println("Você realizou seu saque com sucesso! \n Saldo atual: " + total);
        return total;
    }

    double pagarBoleto(double valorBoleto, double saldo) {
        double total = saldo - valorBoleto;
        System.out.println("O pagamento do seu boleto foi foito!");
        return total;
    }

    final double valorChequeEspecial = chequeEspecial(saldo);

    boolean usoCheque (double chequeEspecial) {
        if (chequeEspecial < valorChequeEspecial) {
            return true;
        }else{
            return false;
        }

    }






}