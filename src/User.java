public class User {
    int id;
    int age;
    String name;
    String surname;
    double weight;
    double height;

public User(int id, int age, String name, String surname, double weight, double height) {
    this.id = id;
    this.age = age;
    this.name = name;
    this.surname = surname;
    this.weight = weight;
    this.height = height;
}

public static void main(String[] args) {
    // Створюємо 10 об'єктів класу User
    User user1 = new User(1, 19, "Михайло", "Задорожній", 75.5, 183.5);
    User user2 = new User(2, 18, "Віталій", "Винарчик", 67.5, 181.0);
    User user3 = new User(3, 47, "Остап", "Григорський", 68.0, 181.0);
    User user4 = new User(4, 18, "Олександр", "Воронцов", 70.5, 180.5);
    User user5 = new User(5, 255, "Володимир-Захар", "Васильченко", 72.5, 186.0);
    User user6 = new User(6, 18, "Олександр", "Комарницький", 62.0, 177.0);
    User user7 = new User(7, 19, "Юра", "Корман", 65.0, 180.0);
    User user8 = new User(8, 27, "Віталій", "Грацонь", 103.0, 187.0);
    User user9 = new User(9, 19, "Михайло", "Бережанський", 75.0, 182.5);
    User user10 = new User(10, 18, "Станіслав", "Матейчук", 67.0, 180.0);

    // Додаємо між собою значення їх віку і виводимо в консоль
    int totalAge = user1.age + user2.age + user3.age + user4.age + user5.age
            + user6.age + user7.age + user8.age + user9.age + user10.age;
    System.out.println("Сума віку: " + totalAge);

    // Додаємо між собою значення їх ваги і виводимо в консоль
    double totalWeight = user1.weight + user2.weight + user3.weight + user4.weight + user5.weight
            + user6.weight + user7.weight + user8.weight + user9.weight + user10.weight;
    System.out.println("Сума ваги: " + totalWeight);

    // Додаємо між собою значення їх зросту і виводимо в консоль
    double totalHeight = user1.height + user2.height + user3.height + user4.height + user5.height
            + user6.height + user7.height + user8.height + user9.height + user10.height;
    System.out.println("Сума зросту: " + totalHeight);
}
}
