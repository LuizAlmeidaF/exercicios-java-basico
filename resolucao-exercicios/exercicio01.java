import java.util.Scanner;

public class ExercicioUM(){

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String name = scanner.nextLine();
        System.out.println("Em que ano você nasceu?");
        int nascimento = scanner.nextInt();
        idade();

        String idade(){
            int anoAtual = 2026;
            int idade = anoAtual - nascimento;
            return String.format("Você tem ou irá fazer %s anos.", idade);
        }


    }
}