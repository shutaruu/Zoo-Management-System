public class Snake extends Reptile {
    private double length; 
    
    public Snake(String name, int age, double weight, double bodyTemperature, double length) {
        super(name, age, weight, bodyTemperature);
        setLength(length);
    }
    
    public double getLength() {
        return length;
    }
    
    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Длина должна быть положительной");
        }
        this.length = length;
    }
    
   
    @Override
    public void makeSound() {
        System.out.println(getName() + " шипит");
    }
    
    
    @Override
    public void feed() {
        System.out.println(getName() + " ест мелких грызунов");
    }
    
 
    public void shedSkin() {
        System.out.println(getName() + " сбрасывает кожу");
    }
    
    @Override
    public String toString() {
        return "Змея " + super.toString() + String.format(", длина: %.1f м", length);
    }
}