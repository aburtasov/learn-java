public class ClassesAndObjects2 {
    public static void main(String[] args) {
     Person person1 = new Person();
     person1.setName("Vova");
     person1.setAge(20);
     person1.speak();

     System.out.println("Информация: " + person1.getName() + " " + person1.getAge());
    
    }
}

class Person {
   private String name;
   private int age;

   public void setName(String username) {  // сеттер
    if (username.isEmpty()) {
        System.out.println("Пустое имя!");
    } else {
        name = username;
    }
   }

   public String getName() {  // геттер
    return name;
   }

   public void setAge(int userage) {  // сеттер
    if (userage < 0 ) {
        System.out.println("Отрицательный возраст!");
    } else {
        age = userage;
    }
   }

   public int getAge() {  // геттер
    return age;
   }

    void speak() {
        System.out.println("Name: " + name + ", Age: " + age);
      }
}
// api - интерфейс через который пользователь получает доступ к функционалу программы. Пользователь не должен трогать внутреннее
// устройство программы.