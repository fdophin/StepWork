package stepwork2;

class Cat5 {

    // поля:
    private String name; // кличка кота
    private int age; // возраст в годах
    private double weight; // вес

    private static int count = 0;
    private /*non-static*/ int serial_number;

    // конструкторы:
    public Cat5() {
        this("Макс", 3, 8);
        //System.out.println("Конструктор по умолчанию!");
    }

    public Cat5(String name) {
        this(name, 3, 8);
        //System.out.println("Конструктор с параметрами! (1)");
    }

    public Cat5(String name, int age) {
        this(name, age, 8);
        //System.out.println("Конструктор с параметрами! (2)");
    }

    // main c-tor
    public Cat5(String name, int age, double weight) {
        //System.out.println("Конструктор с параметрами! (3)");
        this.name = name;
        this.age = age;
        this.weight = weight;
        count++;
        serial_number = count;
    }

    public static int getCount() {
        return count;
    }

    public int getNumber() {
        return serial_number;
    }

    ///////////////////////////////////////
    public void about() {
        System.out.println("Кот по кличке " + name + ", cерийный номер: " + serial_number);
    }
}

public class stepwork25 {

    public static void main(String[] args) {
        System.out.println("Всего сейчас есть котов: " + Cat5.getCount());

        Cat5 a = new Cat5("Пуся");
        a.about();

        System.out.println("Всего сейчас есть котов: " + Cat5.getCount());

        Cat5 b = new Cat5("Мася");
        b.about();

        System.out.println("Всего сейчас есть котов: " + Cat5.getCount());
    }

}
