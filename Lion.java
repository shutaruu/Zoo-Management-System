// Конкретный класс Lion наследуется от Vertebrate
public class Lion extends Vertebrate {
    private double maneLength; // Длина гривы
    
    public Lion(String name, int age, double weight, double maneLength) {
        super(name, age, weight);
        setManeLength(maneLength);
    }
    
    public double getManeLength() {
        return maneLength;
    }
    
    public void setManeLength(double maneLength) {
        if (maneLength < 0) {
            throw new IllegalArgumentException("Длина гривы не может быть отрицательной");
        }
        this.maneLength = maneLength;
    }
    
    // Полиморфизм
    @Override
    public void makeSound() {
        System.out.println(getName() + " рычит");
    }
    
    // Полиморфизм
    @Override
    public void feed() {
        System.out.println(getName() + " ест мясо");
    }
    
    // Специфичное поведение 
    public void hunt() {
        System.out.println(getName() + " охотится");
    }
    
    @Override
    public String toString() {
        return "Лев " + super.toString() + String.format(", длина гривы: %.1f см", maneLength);
    }
}