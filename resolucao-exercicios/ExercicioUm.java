import java.util.Scanner;

public class ExercicioUm {
    static int nascimento;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Qual o seu nome?");
        String name = scanner.nextLine();
        System.out.println("Em que ano você nasceu?");
        nascimento = scanner.nextInt();
        scanner.close();
        idade(name);
    }

    static void idade(String nome) {
        int anoAtual = 2026;
        int idade = anoAtual - nascimento;
        System.out.println(String.format("Olá %s, você tem ou irá fazer %s anos.", nome, idade));
    }
}