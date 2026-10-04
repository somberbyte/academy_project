package pavel_chukov;
import java.util.Scanner;

public class Task_third {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int lastDigit = number % 10;
        int middleDigit = (number / 10) % 10;
        int firstDigit = number / 100;

        int reversedNumber = (lastDigit * 100) + (middleDigit * 10) + firstDigit;
        System.out.println("Перевернутое число: " + reversedNumber);

        scanner.close();
    }
}
