import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

class Product {
    private String name;
    private int volume;

    public Product(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}

class HotDrink extends Product {
    private int temperature;

    public HotDrink(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}

interface VendingMachine {
    Product getProduct(String name, int volume);
}

class HotDrinkVendingMachine implements VendingMachine {
    private Set<HotDrink> drinks = new HashSet<>();

    public void addDrink(HotDrink drink) {
        drinks.add(drink);
    }

    @Override
    public Product getProduct(String name, int volume) {
        for (HotDrink drink : drinks) {
            if (drink.getName().equals(name) && drink.getVolume() == volume) {
                return drink;
            }
        }
        return null;
    }

    public HotDrink getProduct(String name, int volume, int temperature) {
        for (HotDrink drink : drinks) {
            if (drink.getName().equals(name) && drink.getVolume() == volume && drink.getTemperature() == temperature) {
                return drink;
            }
        }
        return null;
    }
}

public class HotDrinkVendingApp {
    public static void main(String[] args) {
        HotDrinkVendingMachine machine = new HotDrinkVendingMachine();

        machine.addDrink(new HotDrink("Кофе", 250, 80));
        machine.addDrink(new HotDrink("Чай", 200, 70));
        machine.addDrink(new HotDrink("Горячий Шоколад", 300, 85));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название напитка:");
        String name = scanner.nextLine();

        System.out.println("Введите объем напитка (мл):");
        int volume = scanner.nextInt();

        System.out.println("Введите температуру напитка (°C):");
        int temperature = scanner.nextInt();

        HotDrink drink = machine.getProduct(name, volume, temperature);
        if (drink != null) {
            System.out.println("Вы выбрали: " + drink.getName() + ", объем: " + drink.getVolume() + " мл, температура: " + drink.getTemperature() + "°C");
        } else {
            System.out.println("Такой напиток не найден.");
        }

        scanner.close();
    }
}
