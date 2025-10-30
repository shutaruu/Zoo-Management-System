import java.util.ArrayList;
import java.util.List;

// Класс Enclosure демонстрирует инкапсуляцию
public class Enclosure {
    // Инкапсуляция
    private List<Animal> animals;
    private String name;
    
    public Enclosure(String name) {
        this.name = name;
        this.animals = new ArrayList<>();
    }
    
    // Контролируемый доступ к добавлению животных
    public void addAnimal(Animal animal) {
        if (animal == null) {
            throw new IllegalArgumentException("Животное не может быть null");
        }
        animals.add(animal);
        System.out.println(animal.getName() + " добавлен в вольер '" + name + "'");
    }
    
    // Контролируемый доступ к удалению животных
    public void removeAnimal(Animal animal) {
        if (animals.remove(animal)) {
            System.out.println(animal.getName() + " удален из вольера '" + name + "'");
        } else {
            System.out.println(animal.getName() + " не найден в вольере '" + name + "'");
        }
    }
    
    // get для доступа к животным (без возможности модификации извне)
    public List<Animal> getAnimals() {
        return new ArrayList<>(animals); 
    }
    
    public String getName() {
        return name;
    }
    
    // Метод для демонстрации полиморфизма
    public void makeAllAnimalsSound() {
        System.out.println("\n--- Звуки из вольера '" + name + "' ---");
        for (Animal animal : animals) {
            animal.makeSound(); // Полиморфизм
        }
    }
    
    // Метод для кормления всех животных
    public void feedAllAnimals() {
        System.out.println("\n--- Кормление в вольере '" + name + "' ---");
        for (Animal animal : animals) {
            animal.feed(); // Полиморфизм
        }
    }
    
    public void displayAnimals() {
        System.out.println("\n--- Животные в вольере '" + name + "' ---");
        if (animals.isEmpty()) {
            System.out.println("Вольер пуст");
        } else {
            for (Animal animal : animals) {
                System.out.println("- " + animal.toString());
            }
        }
    }
}