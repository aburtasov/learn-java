import java.util.Scanner;

// java.lang  -> String ... default import
// java.util

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        String str = "MyString";

        String s = new String("TestString"); // Объект типа String

        Scanner scan = new Scanner(System.in); // new Новый объект класса Scanner // System.in ->  поток для чтения
        

        System.out.println(str + s);
        
        System.out.println("Введите данные: ");
        String string = scan.nextLine();
        System.out.println("Ваши данные: " + string);

        scan.close();
    }
}
