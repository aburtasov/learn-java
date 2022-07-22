package Package1;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.say);
        // если поле привтаное, то в пределах пакета не получится получить доступ к нему
        // p1.name = "Tom"; // not working
    }
}
