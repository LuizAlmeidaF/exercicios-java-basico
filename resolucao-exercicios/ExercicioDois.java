import java.util.Scanner;

public class ExercicioDois {
    static int ladoQuadrado;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Qual o lado do quadrado?");
        ladoQuadrado = scanner.nextInt();
        System.out.println(String.format("A area do quadrado é: %s", ExercicioDois.areaQuadrado(ladoQuadrado)));
    
        
    }
    static int areaQuadrado(int lado){
        int area = lado *lado;
        return area;
    }

}
