import java.util.Scanner;

public class Reverse {
    public static int reverseNumber(int n, int rev) {
        if (n == 0) {
            return rev;
        }

        return reverseNumber(n / 10, rev * 10 + n % 10);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                
                int result = reverseNumber(num, 0);
                
                System.out.println("Перевернутое число: " + result);
            }
        }
    }
}