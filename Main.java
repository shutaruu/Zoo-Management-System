import java.io.*;

public class Main {
    static {
        System.setProperty("file.encoding", "UTF-8");
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            // Делал в VSC, но консоль не пропуска ру символы, поэтому добавил
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== СИСТЕМА УПРАВЛЕНИЯ ЗООПАРКОМ ===\n");

        System.out.println("1. ДЕМОНСТРАЦИЯ АБСТРАКТНЫХ КЛАССОВ:");
        try {
            // Этот код вызовет ошибку
            // Vertebrate vertebrate = new Vertebrate("Абстрактное", 1, 1.0);
            System.out.println("Абстрактные классы (Vertebrate, Reptile) не могут быть созданы напрямую");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("\n2. СОЗДАНИЕ ЖИВОТНЫХ:");
        
        Lion lion = new Lion("Симба", 5, 190.5, 45.0);
        Elephant elephant = new Elephant("Дамбо", 10, 4500.0, 120.5);
        Snake snake = new Snake("Каа", 3, 8.2, 28.5, 4.2);
        
        System.out.println(lion.toString());
        System.out.println(elephant.toString());
        System.out.println(snake.toString());
        
        System.out.println("\n3. СОЗДАНИЕ ВОЛЬЕРОВ:");
        
        Enclosure bigCatsEnclosure = new Enclosure("Вольер больших кошек");
        Enclosure reptilesEnclosure = new Enclosure("Террариум рептилий");
        
        bigCatsEnclosure.addAnimal(lion);
        reptilesEnclosure.addAnimal(snake);
        
        System.out.println("\n4. ДЕМОНСТРАЦИЯ ПОЛИМОРФИЗМА:");
        
        Animal[] animals = {lion, elephant, snake};
        
        System.out.println("--- Разные животные издают разные звуки ---");
        for (Animal animal : animals) {
            animal.makeSound(); // Полиморфизм(один метод, но разное поведение)
        }
        
        System.out.println("\n--- Разные животные по-разному питаются ---");
        for (Animal animal : animals) {
            animal.feed(); //Полиморфизм
        }
        
        System.out.println("\n5. РАБОТА С ВОЛЬЕРАМИ:");
        
        bigCatsEnclosure.displayAnimals();
        reptilesEnclosure.displayAnimals();
        
        bigCatsEnclosure.makeAllAnimalsSound();
        reptilesEnclosure.makeAllAnimalsSound();
        
        System.out.println("\n6. ДЕМОНСТРАЦИЯ ИНКАПСУЛЯЦИИ:");
        
        // Попытка установить недопустимые значения
        try {
            lion.setAge(-1); // Вызовет исключение
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка инкапсуляции: " + e.getMessage());
        }
        
        try {
            lion.setName(""); // Вызовет исключение
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка инкапсуляции: " + e.getMessage());
        }
        
        // Корректное использование инкапсуляции
        lion.setAge(6);
        lion.setName("Симба II");
        System.out.println("Обновленные данные льва: " + lion.toString());

        System.out.println("\n7. СПЕЦИФИЧНОЕ ПОВЕДЕНИЕ ЖИВОТНЫХ:");
        
        lion.hunt();
        elephant.sprayWater();
        snake.baskInSun();
        snake.shedSkin();
        
        System.out.println("\n8. ОБЩЕЕ ПОВЕДЕНИЕ ПОЗВОНОЧНЫХ:");
        
        lion.sleep();
        elephant.move();
        snake.sleep();
        
        System.out.println("\n=== ДЕМОНСТРАЦИЯ ЗАВЕРШЕНА ===");
    }
}