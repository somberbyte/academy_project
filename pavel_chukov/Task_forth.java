package pavel_chukov;
import java.util.Scanner;

public class Task_forth {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сколько минут прошло с начала суток: ");
        int time = scanner.nextInt();

        System.out.printf("Прошло %s", (time / 60), "часов", (time % 60), "минут");
        scanner.close();
    }
}
