import java.util.Scanner;

public class Watches {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите количество минут (N): ");
            int n = scanner.nextInt();
            int hours = (n / 60) % 24;
            int minutes = n % 60;
            System.out.printf("С начала суток прошло %02d часов, %02d минут%n", hours, minutes);
        }
}
}