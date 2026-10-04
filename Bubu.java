import java.util.Scanner;
//задание 5
public class Bubu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("a = ");
        int a = scanner.nextInt();

        System.out.print("b = ");
        int b = scanner.nextInt();

        a = a+b;


        b= a-b;
        a=a-b;

        System.out.println("a = "+ a +" b = "+b);

        scanner.close();
    }
}
