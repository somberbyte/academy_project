public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.class);

        System.out.print("Введите значение a: ");
        int a = scanner.nextInt();

        System.out.print("Введите значение b: ");
        int b = scanner.nextInt();


        a = a + b; 
        b = a - b;
        a = a - b; 


        System.out.println("Выходные данные: a = " + a + ", b = " + b);
        
       
    }
}
