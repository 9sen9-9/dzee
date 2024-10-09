import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class main {
    public static void main(String[] args) {
///1
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Устоновите приложение для Android по ссылке");
        } else {
            System.out.println("Устоновите приложение для IOS по ссылке");
        }


///2

        int clientO = 1;
        int clientDeviceYear = 2015;
        if (clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию для ios ");
        } else {
            System.out.println("Установите версию для IOS");
        }
        if (clientDeviceYear >= 2015) {
            System.out.println("Установите облегченную версию для android");
        } else {
            System.out.println("Устанвоите версию для Android");
        }


        /// 3
        int year = 2021;
        if (year <= 1584) {
        } else if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0) {
            System.out.println("год является високосным =" + year);
        } else {
            System.out.println("год не является високосным =" + year);
        }


        /// 4
        int deliveryDistance = 95;
        if (deliveryDistance > 95) {
            System.out.println("сутки");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("двое суток");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("трое суток");
        } else if (deliveryDistance > 100) {
            System.out.println("нет доставки");
        } else {
            System.out.println("понадобится дней" + deliveryDistance);

        }


        /// 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 2:
            case 1:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                ;
                System.out.println("Осень");
            default:
                System.out.println("Такого месяца не существует");
                break;
        }


    }
    }