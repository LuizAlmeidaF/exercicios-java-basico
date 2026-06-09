import java.util.Scanner;

public class ExercicioSete {
    static int num1;
    static int num2;
    static boolean maior;
    private static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){
        System.out.println("Digite o primeiro numero:");
        num1 = scanner.nextInt();
        System.out.println("Digite um segundo numero maior:");
        num2 = scanner.nextInt();
        System.out.println("Você quer imprimir os pares ou impares? \n1. Pares \n2. Impares");
        int selecao = scanner.nextInt();
        maior = num1 < num2;
        if(maior && selecao == 1){
            par(num1, num2);
        } else if (maior && selecao == 2) {
            impar(num1, num2);

        }


    }

    static void par(int num1, int num2) {
        int contagem = num2 - num1;
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 2){
                System.out.println(i);
            }
        }
    }
    static void impar(int num1, int num2) {
        int contagem = num2 - num1;
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
    }

}
