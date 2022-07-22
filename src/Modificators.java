import Package1.Person;

public class Modificators {

    public int id; // доступ везде на протяжение одного проекта, в пределах класса, в другом классе, в другом пакете

    int count; // default. модификатор доступа в пакете - package level. все что default доступно в пределах пакета 

    private int secret; // доступ к полю только в пределах класса

    protected int digit;  // protected доступны в пределах одного пакета, доступны всем подклассам, даже если эти подклассы вне пакета, где эти поля были декларированы
    public static void main(String[] args) {
        // public,private,default,protected  - модификаторы доступа
    }

    private void technicalMethod() {

    } // метод используется в пределах нашего класса. Не хотим, чтобы метод был частью API.
    // технический метод для внутренних нужд

    Person person1 = new Person();
    person1.name = "Bob";
}   

// класс либо public, либо default
// в одном файле не может быть 2-х публичных классов
// default class - вспомога

class Test2 {

}