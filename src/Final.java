public class Final {
    public static void main(String[] args) {
         // Final.EXAMPLE = 10; не сработает
         final int X = 10;
         System.out.println(X);
    }
}

class Test {
    public static final int EXAMPLE = 0; // final - после получения значения, переменная не будет меняться
   
}  