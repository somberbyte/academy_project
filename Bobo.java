import java.util.Scanner;
//задание 4
public class Bobo {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите сколько минут прошла с начала суток:");
        int minutes = scanner.nextInt();

        int hour = minutes/60;
        int min = minutes - (hour*60);
        System.out.println(hour+":"+min);
        scanner.close();
     }
}
