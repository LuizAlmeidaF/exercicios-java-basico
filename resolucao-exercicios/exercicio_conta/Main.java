package exercicio_conta;
import exercicio_conta.model.CreateOption;
import exercicio_conta.model.MenuOption;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        String nome;
        String conta;
        String agencia;
        double saldo;
        

        System.out.println("Olá sejá bem vindo, vamos criar sua conta bancaria?");
        System.out.println("Qual o seu nome?");
        nome = scanner.next();
        System.out.println("Qual o número da sua conta?");
        conta = scanner.next();
        System.out.println("Qual a sua agência?");
        agencia = scanner.next();
        System.out.println("Quanto você quer colocar na conta ao criar ela?");
        saldo = scanner.nextDouble();
        boolean continuar = true;
        ContaBancaria contaBancaria = null;

        while (continuar) {
            System.out.println("Deseja criar a conta com base nessas informações?");
            System.out.println("1 - Criar");
            System.out.println("2 - Sair");
            var userInput = scanner.nextInt();
            var selectedOption = CreateOption.values()[userInput -1];
            switch (selectedOption){
                case CREATE -> {
                    contaBancaria = new ContaBancaria();
                    contaBancaria.setName(nome);
                    contaBancaria.setConta(conta);
                    contaBancaria.setAgencia(agencia);
                    contaBancaria.setSaldo(saldo);
                    System.out.println(String.format("A conta de %s foi criada.", contaBancaria.getName()));
                    continuar = false;
                }
                case EXIT -> System.exit(0);
            }
        }
        while(true) {
            System.out.println("Qual operação deseja realizar?");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Consultar Cheque especial");
            System.out.println("3 - Depositar Dinheiro");
            System.out.println("4 - Sacar Dinheiro");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar uso do cheque especial");
            System.out.println("7 - Sair");
            var userInput = scanner.nextInt();
            var selectedOption = MenuOption.values()[userInput -1];
            switch (selectedOption){
                case CONSULT_BALANCE -> {
                    contaBancaria.consultarSaldo(contaBancaria.getSaldo(),
                     contaBancaria.saldoReal(contaBancaria.getSaldo(),
                      contaBancaria.chequeEspecial(saldo)));
                }
                case CONSULT_OVERDRAFT -> {
                    System.out.println(String.format("Seu cheque especial atualmente é: %s\n", contaBancaria.chequeEspecial(saldo)));
                }
                case DEPOSIT -> {

                }
                case DRAW_SOME_MONEY -> {

                }
                case PAY -> {

                }
                case VERIFY_OVERDRAFT -> {

                }
                case EXIT -> System.exit(0);
            }
        }
    }
}
