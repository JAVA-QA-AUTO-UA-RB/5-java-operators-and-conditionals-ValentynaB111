import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ласкаво просимо до казкового лісу! Ваше завдання — пройти крізь нього, приймаючи правильні рішення.");

        int health = 100;
        int luck = 50;

        // Подія 1: Роздоріжжя
        System.out.println("Подія 1: Роздоріжжя.");
        System.out.println("Вибір 1 - Стара стежка (-20 здоров'я)");
        System.out.println("Вибір 2 - Знайти скарб (+30 удачі)");
        System.out.println("Інше число - заблукати (-10 здоров'я)");
        System.out.print("Ваш вибір: ");

        int choice1 = scanner.nextInt();

        if (choice1 == 1) {
            health -= 20;
            System.out.println("Ви пішли старою стежкою. Здоров'я: " + health);
        } else if (choice1 == 2) {
            luck += 30;
            System.out.println("Ви знайшли скарб! Удача: " + luck);
        } else {
            health -= 10;
            System.out.println("Ви заплуталися. Здоров'я: " + health);
        }

        // Подія 2: Колодязь
        System.out.println("Подія 2: Ви натрапили на загадковий колодязь.");
        System.out.println("1 - Випити магічну воду (+50 здоров'я)");
        System.out.println("2 - Ігнорувати колодязь (-10 удачі)");
        System.out.println("Інше число - нічого не змінюється");
        System.out.print("Ваш вибір: ");

        int choice2 = scanner.nextInt();

        if (choice2 == 1) {
            health += 50;
            System.out.println("Ви отримали прилив сил! Здоров'я: " + health);
        } else if (choice2 == 2) {
            luck -= 10;
            System.out.println("Ви втомилися. Удача: " + luck);
        } else {
            System.out.println("Ви нічого не робите.");
        }

        // Подія 3: Чарівна істота
        System.out.println("Подія 3: Ви зустріли чарівну істоту.");
        System.out.println("1 - Істота дружня і ділиться їжею (+20 здоров'я)");
        System.out.println("2 - Істота ворожа і атакує (-30 здоров'я)");
        System.out.println("3 -  Істота байдужа (нічого не змінюється)");
        System.out.print("Ваш вибір: ");

        int creatureType = scanner.nextInt();

        if (creatureType == 1) {
            health += 20;
            System.out.println("Істота дружня і ділиться їжею. Здоров'я: " + health);
        } else if (creatureType == 2) {
            health -= 30;
            System.out.println("Істота ворожа і атакує! Здоров'я: " + health);
        } else {
            System.out.println("Істота байдужа. Нічого не сталося.");
        }


        System.out.println("Результат");
        System.out.println("Здоров'я: " + health + ", Удача: " + luck);

        // Стан гравця
        if (health <= 0 || luck <= 0) {
            System.out.println("Ви не змогли пройти ліс. Спробуйте ще раз!");
        } else {
            System.out.println("Вітаємо! Ви змогли пройти через чарівний ліс!");
        }

        scanner.close();
    }
}
