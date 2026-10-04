import java.util.Scanner;
//задание 2
public class Bebe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int num2 = scanner.nextInt();
        System.out.println("Введите третье число:");
        int num3 = scanner.nextInt();

        int sum = num1 + num2 +num3;
        System.out.println("Сумма чисел равна "+sum);

        scanner.close();
            
    }
}
