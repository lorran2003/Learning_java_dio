import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void name() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        String age = sc.nextLine();
        System.out.printf("Hello %s, nice to meet you are %s years old", name, age);
    };

    public static void main(String[] args) {
        name();
    }
}