// Конкретный класс Elephant наследуется от Vertebrate
public class Elephant extends Vertebrate {
    private double tuskLength; // Длина бивней
    
    public Elephant(String name, int age, double weight, double tuskLength) {
        super(name, age, weight);
        setTuskLength(tuskLength);
    }
    
    public double getTuskLength() {
        return tuskLength;
    }
    
    public void setTuskLength(double tuskLength) {
        if (tuskLength < 0) {
            throw new IllegalArgumentException("Длина бивней не может быть отрицательной");
        }
        this.tuskLength = tuskLength;
    }
    
    // Полиморфизм
    @Override
    public void makeSound() {
        System.out.println(getName() + " трубит: ТУУУУУУ!");
    }
    
    // Полиморфизм
    @Override
    public void feed() {
        System.out.println(getName() + " ест фрукты и овощи");
    }
    
    // Специфичное поведение
    public void sprayWater() {
        System.out.println(getName() + " обливается водой из хобота");
    }
    
    @Override
    public String toString() {
        return "Слон " + super.toString() + String.format(", длина бивней: %.1f см", tuskLength);
    }
}