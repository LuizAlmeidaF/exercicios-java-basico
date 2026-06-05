import java.util.Scanner;

public class ExercicioQuatro {
    static Scanner scanner = new Scanner(System.in);
    public static void main() {
        int diferenca;
        System.out.println("Qual o nome e a idade da primeira pessoa?");
        String name1 = scanner.next();
        int idade1 = scanner.nextInt();
        System.out.println("Qual o nome e idade da segunda pessoa?");
        String name2 = scanner.next();
        int idade2 = scanner.nextInt();
        if (idade1 > idade2){
            diferenca = idade1 - idade2;
        }else{
            diferenca = idade2 - idade1;
        }
        System.out.println(String.format("A diferença de idade entre %s e %s é %s.", name1, name2, diferenca));
    }
}