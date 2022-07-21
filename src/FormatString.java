public class FormatString {
     public static void main(String[] args) {
        System.out.print("Hello");
        System.out.println(" World!");

        String s1 = "Test";
        System.out.printf("This is a string, %s\n",s1); // %d,%s,%f
        System.out.printf("String %10d\n",532); // отступ
        System.out.printf("String %.2f\n",532.34252);
    }
}