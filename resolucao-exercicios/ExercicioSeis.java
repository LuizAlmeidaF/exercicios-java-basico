import java.util.Scanner;

public class ExercicioSeis {
    static Scanner scanner = new Scanner(System.in);
    public static void main() {
        
        System.out.println("Qual o seu nome?");
        String name = scanner.nextLine();
        System.out.println(String.format("Olá %s, seja muito bem vindo, vamos calcular o seu IMC?", name));
        System.out.print("Primeiro me passe o seu peso: ");
        float peso = scanner.nextFloat();
        System.out.print("Agora me informe a sua altura: ");
        float altura = scanner.nextFloat();
        float imc = imc(peso, altura);

        if (imc <= 18.5){
            System.out.println(String.format("%s seu imc é %s você está abaixo do peso.", name, imc));
        } else if (imc > 18.5 && imc <= 24.9){
            System.out.println(String.format("%s seu imc é %s você está no peso ideal.", name, imc));
        } else if (imc > 24.9 && imc <= 29.9){
            System.out.println(String.format("%s seu imc é %s você está levemente acima do peso.", name, imc));
        } else if (imc > 29.9 && imc <= 34.9){
            System.out.println(String.format("%s seu imc é %s você está com Obesidade Grau I.", name, imc));
        } else if (imc > 34.9 && imc <= 39.9){
            System.out.println(String.format("%s seu imc é %s você está com Obesidade Grau II.", name, imc));
        } else if (imc >= 40.0){
            System.out.println(String.format("%s seu imc é %s você está com Obesidade Grau III.", name, imc));
        }

    }

    static float imc(float a, float b){
        float imc = a / (b * b);
        return imc;
    }
}
    
