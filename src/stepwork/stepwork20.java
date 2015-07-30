package stepwork;

class Cat {

    // поля:
    private String name; // кличка кота
    private String color; // цвет (масть)
    private int age; // возраст в годах
    private double weight; // вес
    private boolean isHungry; // голодный или нет?

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isHungry() {
		return isHungry;
	}

	public void setHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}

	// методы:
    public void Play() {
        System.out.println(name + " играется!");
    }

    public void Sleep() {
        System.out.println(name + " спит.");
    }

    public void Hunt() {
        System.out.println(name + " охотится...");
    }
}

public class  stepwork20 {

    public static void main(String[] args) {
        Cat Vasiliy = new Cat();
        Vasiliy.Play();
        Vasiliy.setName("NEWname");
        Vasiliy.Hunt();
        Vasiliy.Sleep();
       // Vasiliy.name = "Vasya"; // Uncompilable source code - name has private access
    }

}
