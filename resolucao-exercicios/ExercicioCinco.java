import java.util.Scanner;

public class ExercicioCinco {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Qual numero você quer fazer a tabuada");
        int num = scanner.nextInt();
        scanner.close();
        int[] tabuada = new int[11];

        for (int i = 0; i <= 10; i++) {
            tabuada[i] = num * i;
        }
        System.out.println(String.format("A tabuada de %s é: \n%s * 1 = %s \n%s * 2 = %s \n%s * 3 = %s \n%s * 4 = %s \n%s * 5 = %s \n%s * 6 = %s \n%s * 7 = %s \n%s * 8 = %s \n%s * 9 = %s \n%s * 10 = %s", num, num, tabuada[1], num, tabuada[2], num, tabuada[3], num, tabuada[4], num, tabuada[5], num, tabuada[6], num, tabuada[7], num, tabuada[8], num, tabuada[9], num, tabuada[10]));

    }
}
