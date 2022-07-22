public class SimpleType {
    public static void main(String[] args) {
        //=====Примитивные типы, не на что не ссылаются======
        // int x = 23;  32 бита
        // short x = 123; 16 бит
        // byte x = 123; -127 до 127
        // long x = 12124; 64 бита
        // double x = 23.432; 64 бита
        // float x = 12.2f; 32 бита

        // float f = 123.2; // по умолчанию тип double вещественного числа
        float f = 123.2f;
        //long l = 1232132423; // по умолчанию тип int
        long l = 3123L;

        int a =123;

        long l = a; // неявное

        int x = (int)l; // явное

        System.out.println(x);

        int j = 123;
        double z = j;

        int t = (int)z; // вещественная часть откидывается

        long g = Math.round(z);
    }
}
