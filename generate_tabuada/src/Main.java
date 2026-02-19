import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número que deseja ver a tabuada: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i <= 10; i++){
            System.out.printf("%s x %s = %s\n", number, i, number * i);
        }
    }
}