import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
    }

    public static void bankApp(int systemType, int phoneYear) {
        int currentYear = LocalDate.now().getYear();
        if (systemType == 0 && phoneYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (systemType == 0 && phoneYear == currentYear) {
            System.out.println("Установите приложение для iOS по ссылке");
        } else if (systemType == 1 && phoneYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (systemType == 1 && phoneYear == currentYear) {
            System.out.println("Установите приложение для Android по ссылке");
        }
    }

    public static int cardDelivery(int distance) {
        int deliveryDays = 0;
        if (distance > 0 && distance <= 20) {
            deliveryDays = 1;
        } else if (distance > 20 && distance <= 60) {
            deliveryDays = 2;
        } else if (distance > 60 && distance <= 100) {
            deliveryDays = 3;
        } else {
            System.out.println("Доставки на такое расстояние нет");
        }

        return deliveryDays;
    }

    public static void main(String[] args) {
        int year = 2004;
        leapYear(year);
        int systemType = 0;
        int phoneYear = 2025;
        bankApp(systemType, phoneYear);
        int deliveryDistance = 95;
        System.out.println(cardDelivery(deliveryDistance));
    }
}