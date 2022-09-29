public class Main {
    public static void main(String[] args) {
        int phoneVersion = 1;
        if (phoneVersion == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (phoneVersion == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        int phoneVersion1 = 0;
        int clientDeviceYear = 2014;
        if (phoneVersion1 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (phoneVersion1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (phoneVersion1 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (phoneVersion1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Устанваливать ничего не нужно");
        }
        //третья задача//
        int year = 2020;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }
        //четвертая задача//
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
            System.out.println("Потребуется дней " + deliveryDays);
        }
        //пятая задача//
        int month = 12;

        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println(" Зимний сезон");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println(" Весенний сезон");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println(" Лентний сезон");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println(" Оссений сезон");
                break;
            default:
                System.out.println(" Такого месяца не существует");
        }
    }
}