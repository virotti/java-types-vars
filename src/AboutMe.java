import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        // os argumentos começam com indice 0
        
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Type your height: ");
            double height = scanner.nextDouble();

            System.out.println("Type your name: ");
            String name = scanner.next();

            //update code below to allow adding more than one word for last name
            System.out.println("Type your last name: ");
            String lastName = scanner.next();

            System.out.println("Type your age: ");
            int age = scanner.nextInt();

            System.out.println("Hello, my name is " + name + " " + lastName);
            System.out.println("I am " + age + " years old");
            System.out.println("I am " + height + "m tall");
        }
    }
}
