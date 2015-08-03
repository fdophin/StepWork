package stepwork2;

class Cat {

    // поля:
    private String name; // кличка кота
    private String color; // цвет (масть)
    private int age; // возраст в годах
    private double weight; // вес
    private boolean hungry = true; // голодный или нет?

    private long exp; // опыт
    private int activity = 100; // запас энергии (0-100).

    // конструкторы:
    public Cat() {
        System.out.println("Конструктор по умолчанию!");
        name = "Макс";
        color = "серый";
        age = 3;
        weight = 8;
    }

    public Cat(String new_name) {
        System.out.println("Конструктор с параметрами! (1)");
        name = new_name;
        color = "серый";
        age = 3;
        weight = 8;
    }

    public Cat(String new_name, int new_age) {
        System.out.println("Конструктор с параметрами! (2)");
        name = new_name;
        color = "серый";
        age = new_age;
        weight = 8;
    }

    public Cat(String new_name, int new_age, double new_weight) {
        System.out.println("Конструктор с параметрами! (3)");
        name = new_name;
        color = "серый";
        age = new_age;
        weight = new_weight;
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
    public void setName(String new_name) {
        name = new_name;
    }

    public void setColor(String new_color) {
        color = new_color;
    }

    public void setAge(int new_age) {
        if (new_age >= 0 && new_age <= 20) {
            age = new_age;
        } else {
            age = 5;
        }
    }

    public void setWeight(double new_weight) {
        if (new_weight >= 5 && new_weight <= 200) {
            weight = new_weight;
        } else {
            weight = 5;
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
}

public class stepwork22 {

    public static void main(String[] args) {
        Cat c = new Cat();
        
        c.about();

        
         /*System.out.println("Повторите, как зовут? - " + c.getName());
         int age = c.getAge();
         System.out.println("А сколько лет? - " + age);
        
         Cat d = new Cat("Гарфилд");
         Cat e = new Cat("Гарфилд", 5);
         Cat f = new Cat("Гарфилд", 5, 30);*/
         
    }

}
