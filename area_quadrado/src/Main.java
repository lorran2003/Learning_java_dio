import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static double areaQuadrado(double lado){
        return lado * lado;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do lado do quadrado para se calcular a area: ");
        double lado = scanner.nextDouble();
        scanner.nextLine();
        System.out.printf("Area do quadrado é: %s", areaQuadrado(lado));
    }
}