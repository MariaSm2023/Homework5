public class Main {
    public static void main(String[] args) {

        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Вы пользуетесь IOS, скачайте приложение по ссылке");
        } else {
            System.out.println("Вы пользуетесь Android, скачайте приложение по ссылке");
        }

        int clientOs1 = 0;
        int clientDeviceYear = 2014;

        if (clientOs1 == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        }
    }

}




