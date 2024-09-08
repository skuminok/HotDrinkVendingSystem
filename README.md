# HotDrinkVendingSystem
# Объяснение:
1. **Интерфейс *VendingMachine*:**
* Описываем метод *getProduct*, который должен реализоваться в классах, представляющих торговые автоматы.
2. **Класс *Product*:**
* Представляет общий продукт с базовыми полями для имени и объема.
3. **Класс *HotDrink*:**
* Наследует *Product* и добавляет поле *temperature* для хранения температуры напитка.
* Переопределяет метод *toString* для удобного вывода информации.
4. **Класс *HotDrinkVendingMachine*:**
* Наследует интерфейс *VendingMachine*.
* Хранит набор горячих напитков и предоставляет методы для добавления и получения напитков.
* Реализует перегруженный метод *getProduct*, который принимает три параметра: имя, объем и температуру, и возвращает напиток, соответствующий этим параметрам.
5. **Класс *HotDrinkVendingApp*:**
* Создает несколько объектов *HotDrink* и добавляет их в *HotDrinkVendingMachine*.
* Выполняет поиск напитков по имени, объему и температуре и выводит результат на экран.

# Принципы ООП:
* **Наследование:** *HotDrink* наследует *Product*.
* **Инкапсуляция:** Поля классов закрыты для прямого доступа, и используются геттеры / сеттеры.
* **Полиморфизм:** Интерфейс *VendingMachine* Реализзация перегруженного метода *getProduct* в классе *HotDrinkVendingMachine*.
* **Абстракция:** Интерфейс *VendingMachine* описывает общее поведение торговых автоматов.
