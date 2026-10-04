import java.util.Scanner;
//задание 3
public class Bibi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите трехзначное число:");
        int num = scanner.nextInt();

        int num1=num%10;
        int num2=(num/10)%10;
        int num3=num/100;
        int numLast=(num1*100)+(num2*10)+num3;
        System.out.println("Результирующее число: "+numLast);

        scanner.close();
    }
}
