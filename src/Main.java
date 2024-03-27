public class Main {
    public static void main(String[] args){
        System.out.println("Задача 1");
        int i = 2400;
        year(i);
        int clientOS = 0;
        int clientDeviceYear = 2016;
        findOutTheYear(clientOS, clientDeviceYear);
        int deliveryDistance = 120;
        daysTillPackage(deliveryDistance);}
    public static void year(int yearToCheck){
        if ((yearToCheck % 4 == 0 && yearToCheck % 100 != 0) || (yearToCheck % 400 == 0)){
            System.out.println("Год " + yearToCheck + " - високосный год");
        } else{
            System.out.println("Год " + yearToCheck + " - невисокосный год");
        }}
    public static void findOutTheYear(int clientOS, int clientDeviceYear){
        if (clientOS == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите обычную версию приложения для IOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }}

    public static void daysTillPackage(int deliveryDistence){
        if (deliveryDistence <= 20) {
            System.out.println("Потребуется 1 день");
        }
        if (deliveryDistence > 20 && deliveryDistence <= 60) {
            System.out.println("Потребуется 2 дня");
        }
        if (deliveryDistence > 60 && deliveryDistence <= 100) {
            System.out.println("Потребуется 3 дня");
        }
        if (deliveryDistence > 100) {
            System.out.println("Доставки нет");
        }
    }
}