package Package1;

public class Person {
    private String name;
    public final static String CONSTANT = "Const"; // доступ публичный, через имя класса
    protected String say;

    public Person() {
        say = "Hello";
    }
}
