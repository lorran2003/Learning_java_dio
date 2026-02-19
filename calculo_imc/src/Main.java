import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculo IMC");
        System.out.printf("Digite seu peso: ");
        float peso = scanner.nextFloat();
        scanner.nextLine();
        System.out.printf("Digite sua altura: ");
        int altura = scanner.nextInt();
        scanner.nextLine();
        float calcIMC = (peso / (altura * altura)) * 10000;
        System.out.printf("Seu IMC é: %.1f\n", calcIMC);


        if (calcIMC <= 18.5) System.out.println("Abaixo do peso");
        else if (calcIMC > 18.5 && calcIMC <= 24.9) System.out.println("peso ideal");
        else if (calcIMC > 24.9 && calcIMC <= 29.9) System.out.println("levemente acima do peso");
        else if (calcIMC > 29.9 && calcIMC <= 34.9) System.out.println("obesidade grau 1");
        else if (calcIMC > 34.9 && calcIMC <= 39.9) System.out.println("obesidade grau 2");
        else System.out.println("obesidade grau 3");

    }
}