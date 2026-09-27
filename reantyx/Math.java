import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numbers = new int[3];
            int sum = 0;
            
            for (int i = 0; i < 3; i++) {
                System.out.print("Введите " + (i + 1) + "-е число: ");
                numbers[i] = scanner.nextInt();
                sum += numbers[i];
            } 
            
            System.out.println("Сумма чисел равна: " + sum);
        }
    }
}