import java.util.Scanner;

public class UserWelcome {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите ваше имя: ");
            String name = scanner.nextLine();
            
            System.out.println("Привет, " + name + ". Добро пожаловать в мир Java");
        }
    }
}