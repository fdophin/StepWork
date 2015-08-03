package stepwork2;

import java.io.IOException;

class Cat6 {

    // поля:
    private String name = "Макс";
    private int age = 1;
    private double weight = 5;

    // конструкторы:
    public Cat6() {
        System.out.println("Конструктор Cat6 по умолчанию!");
    }

    public Cat6(String name) {
        this.name = name;
        System.out.println("Конструктор Cat6 с параметрами!");
    }

    public void about() {
        System.out.println("Кот по кличке " + name);
    }
}

class Munchkin extends Cat6 {

    private short height;

    public Munchkin() {
        System.out.println("Конструктор Munchkin по умолчанию!");
        // name = "Манчик"; // change private to protected!
    }

    public void setHeight(short height) {
        this.height = height;
    }

    public short getHeight() {
        return height;
    }

    public void showPicture() throws IOException {
        Runtime r = Runtime.getRuntime();
        r.exec("cmd /c start http://www.vanCat6s.ru/Koshki_Porodi/Munchkin_Cat6_3_143535467768_www.vanCat6s.ru.jpg");
    }
}

public class stepwork26 {

    public static void main(String[] args) throws IOException {

        Cat6 a = new Cat6("Пуся");
        a.about();

        Munchkin m = new Munchkin();
        m.showPicture();

    }
}
