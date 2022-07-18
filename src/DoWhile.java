import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //  System.in - входной поток
        /*System.out.println("Введите 5");
        int value = scanner.nextInt();

        while(value != 5) {
            System.out.println("Введите 5");
            value = scanner.nextInt();
        }

        System.out.println("Вы ввели 5");
        scanner.close(); */
        int value;

        do {
            System.out.println("Введите 5");
           // int value = scanner.nextInt(); видна только внутри do
            value = scanner.nextInt();
            
        }while(value != 5);

        System.out.println("Вы ввели 5!!!");
        scanner.close();

    }
}
