package stepwork2;

class Cat3 {

    // поля:
    private String name; // кличка кота
    private String color; // цвет (масть)
    private int age; // возраст в годах
    private double weight; // вес
    private boolean hungry = true; // голодный или нет?

    private long exp; // опыт
    private int activity = 100; // запас энергии (0-100).

    // конструкторы:
    public Cat3() {
        System.out.println("Конструктор по умолчанию!");
        name = "Макс";
        color = "серый";
        age = 3;
        weight = 8;
    }

    public Cat3(String name) {
        System.out.println("Конструктор с параметрами! (1)");
        this.name = name;
        color = "серый";
        age = 3;
        weight = 8;
    }

    public Cat3(String name, int age) {
        System.out.println("Конструктор с параметрами! (2)");
        this.name = name;
        color = "серый";
        this.age = age;
        weight = 8;
    }

    public Cat3(String name, int age, double weight) {
        System.out.println("Конструктор с параметрами! (3)");
        this.name = name;
        color = "серый";
        this.age = age;
        this.weight = weight;
    }

    // методы:
    public void play() {
        if (activity < 10) {
            System.out.println(name + " устал, и не хочет сейчас играться :(");
            return;
        }
        if (hungry) {
            System.out.println(name + " хочет кушать, не до игр ему сейчас! :(");
            return;
        }
        System.out.println(name + " играется!");
        activity -= 10;
        weight -= 0.5;
    }

    public void sleep() {
        System.out.println(name + " спит.");
        activity = 100;
        hungry = true;
    }

    public void hunt() {
        if (activity > 25) {
            System.out.println(name + " охотится...");
            activity -= 25;
            exp += 5;
            hungry = false;
            weight += 2;
        }
    }

    /////////////////////////////////////////
    // сеттеры:
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 20) {
            this.age = age;
        } else {
            this.age = 5;
        }
    }

    public void setWeight(double weight) {
        if (weight >= 5 && weight <= 200) {
            this.weight = weight;
        } else {
            this.weight = 5;
        }
    }

    ////////////////////////////////////////////////////
    // геттеры:
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isHungry() {
        return hungry;
    }

    public long getExp() {
        return exp;
    }

    public int getActivity() {
        return activity;
    }

    ///////////////////////////////////////
    public void about() {
        System.out.println("Кот по кличке " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Вес: " + weight + "кг");
        System.out.println("Уровень активности: " + activity + "%");
        System.out.print("Голоден: ");
        if (hungry) {
            System.out.println("ДА");
        } else {
            System.out.println("НЕТ");
        }
    }

    public Cat3 whoAreYou() {
        return this;
    }
}

public class stepwork23 {

    public static void main(String[] args) {
        Cat3 c = new Cat3();
        System.out.println(c);
        System.out.println(c.whoAreYou());
        Cat3 d = new Cat3();
        System.out.println(d);
        System.out.println(d.whoAreYou());
    }

}
