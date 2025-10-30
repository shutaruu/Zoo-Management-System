// Абстрактный класс Vertebrate реализует интерфейс Animal
public abstract class Vertebrate implements Animal {
    // Инкапсуляция
    private String name;
    private int age;
    private double weight;
    
    // Конструктор
    public Vertebrate(String name, int age, double weight) {
        setName(name);
        setAge(age);
        setWeight(weight);
    }
    
    //get && set проверки (инкапсуляция)
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        this.age = age;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Вес должен быть положительным");
        }
        this.weight = weight;
    }
    
    // Общие методы для всех позвоночных
    public void sleep() {
        System.out.println(name + " спит");
    }
    
    public void move() {
        System.out.println(name + " двигается");
    }
    
    // Абстрактные методы, которые реализованы в дочерних классах
    @Override
    public abstract void makeSound();
    
    @Override
    public abstract void feed();
    
    @Override
    public String toString() {
        return String.format("%s (возраст: %d лет, вес: %.1f кг)", name, age, weight);
    }
}