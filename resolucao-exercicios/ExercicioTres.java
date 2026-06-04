import java.util.Scanner;

public class ExercicioTres {
    static int base;
    static int altura;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Qual a base do retangulo?");
        base = scanner.nextInt();
        System.out.println("Qual a altura do retangulo?");
        altura = scanner.nextInt();


        if(base == altura){
            System.out.println("Essa forma não é um retangulo e sim o quadrado, e sua área é: " + area(base, altura));
        }else{
            System.out.println("A área do retangulo é: " + area(base, altura));
        }
    }

    static int area(int base, int altura){
        int area = base * altura;
        return area;
    }
}
