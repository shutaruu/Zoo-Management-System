// Абстрактный класс Reptile наследуется от Vertebrate
public abstract class Reptile extends Vertebrate {
    private double bodyTemperature;
    
    public Reptile(String name, int age, double weight, double bodyTemperature) {
        super(name, age, weight);
        setBodyTemperature(bodyTemperature);
    }
    
    public double getBodyTemperature() {
        return bodyTemperature;
    }
    
    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }
    
    // Специфичное поведение 
    public void baskInSun() {
        System.out.println(getName() + " греется на солнце");
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format(", температура тела: %.1f°C", bodyTemperature);
    }
}