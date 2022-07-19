public class Arrays {
    public static void main(String[] args) {
       // int num = 10; // примитивный тип данных   [10]
      //  char character = 'a';
      //  String s = "Hello"; // ссылочный тип данных
      //  String s1 = new String("Hello");
       
      int[] numbers = new int[5];  // numbers  ---> [массив]  ссылка
      
      System.out.println(numbers[0]);  // indexes 0 1 2 3 4
      //numbers[0] = 10;
      for(int i = 0; i<numbers.length; i++) {
        numbers[i] = i * 10;
      }

      for(int i = 0; i<numbers.length; i++) {
        System.out.println(numbers[i]);
      }

      System.out.println(); // пробел

      int[] numbers1 = {1,2,3,4,5}; // второй способ инициализации массива

      for(int i = 0; i<numbers1.length; i++) {
        System.out.println(numbers1[i]);
      }


    }
}


/*
 
На самом деле есть разница в создании строки:
String s = "Hello";
String s1 = new String("Hello");
а именно в способе хранения в памяти. В первом случае строка заносится в специально выделенную область памяти для хранения строк - пул строк. 
Перед этим проверяя нет ли там точно такой же строки, если есть - ссылка s будет указывать на эту строку, если нет, то эта строка туда заносится. 
Во втором случае она принудительно создает объект строки вне пула строк, 
и под каждую строку, созданную таким образом, будет выделяться область в памяти, даже если содержимое строк эквивалентно.

 */