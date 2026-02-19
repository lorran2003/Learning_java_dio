import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a base do retangulo: ");
        double base = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Digite a altura do retangulo: ");
        double altura = scanner.nextDouble();
        scanner.nextLine();
        System.out.printf("Area do retangulo é: %s", base * altura );
    }
}