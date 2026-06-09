import java.util.Scanner;

public class ExercicioOito {
    static double div = 1;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Bem vindo ao sistema para fazer divisões inteiras.");
        System.out.println("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();
        while (div != 0){
            System.out.println("Agora digite o segundo numero: ");
            int num2 = scanner.nextInt();
            div = num1 % num2;
//            System.out.println(div);
            if(div == 0){
                System.out.println("O resto da divisão é 0");
            }
        }

    }
}
