import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos calcular a diferença de idade entre duas pessoas");

        System.out.print("\nDigite o nome da primeira pessoa: ");
        String nome1 = scanner.nextLine();
        System.out.print("\nDigite a idade da primeira pessoa: ");
        int idade1 = scanner.nextInt();
        scanner.nextLine();

        Pessoa pessoa1 = new Pessoa(nome1, idade1);

        System.out.print("\nDigite o nome da segunda pessoa: ");
        String nome2 = scanner.nextLine();
        System.out.print("\nDigite a idade da segunda pessoa: ");
        int idade2 = scanner.nextInt();
        scanner.nextLine();

        Pessoa pessoa2 = new Pessoa(nome2, idade2);

        System.out.printf("\nA diferença de idade entre %s e %s é de : %s", pessoa1.getNome(), pessoa2.getNome(), pessoa1.getIdade() > pessoa2.getIdade() ? pessoa1.getIdade() - pessoa2.getIdade() : pessoa2.getIdade() - pessoa1.getIdade());


    }
}