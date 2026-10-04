import java.util.Scanner;
//задание 1
public class Byby{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите ваше имя");
        String name = scanner.nextLine();

        System.out.println("Привет " + name + "! Добро пожаловать в мир Java");

        scanner.close();
    }
    

}