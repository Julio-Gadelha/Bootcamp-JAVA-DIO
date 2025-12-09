import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        var name = scanner.next();

        System.out.println("Informe sua idade:");
        var age = scanner.nextInt();

        if (age >= 17) {
            System.out.printf("Olá %s! Você tem %d anos, você pode dirigir.\n", name, age);
        }

        System.out.println("Fim da execução");
    }
}

