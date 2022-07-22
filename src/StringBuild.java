import java.lang.StringBuilder;

public class StringBuild {
     public static void main(String[] args) {
        String s1 = "Hello"; // объект класса String , не изменится до конца программы
        s1.toUpperCase(); // не сработает, тк строка не меняется
        System.out.println(s1); // строка не изменилась

        s1 = s1.toUpperCase(); // переопределение, возвратилась новая строка
        // после этого старый объект удалится из памяти сборщиком мусора, тк на него
        // больше никто не ссылается

        String s2 = "Hello!";
        String s3 = "my";
        String s4 = "friend";
        String strAll = s2 + s3 + s4; // если много конкотенации, то расходуется память, снижается скорость программы
        // поэтому лучше использовать класс StringBuilder

        System.out.println(strAll);

        
        StringBuilder sb = new StringBuilder("Hello"); // from java.lang
        System.out.println(sb.toString());

        sb.append("World!");
        sb.append("Friends");
        //  sb.append("World!").append("Friends!")

        System.out.println(sb.toString());



    }
}
/*
 * 2 типа объектов - mutable(изменяемый) и unmutable(неизменяемый)
 * предыдущий класс Human - изменяемый, мы меняли состояние объекта
 * 
 * Тип данных String - unmutable
 */