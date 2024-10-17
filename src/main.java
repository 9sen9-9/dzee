import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class main {
    public static void main(String[] args) {
///1
        System.out.println("Task1");
        int delay = 15000;
        int total = 0;
        int i = 0;
        for (; total < 2_459_000; i++) {
            total = delay + total + (total / 100);
            System.out.println("Месяц" + i + "сумма накоплений равна" + total + "рублей");
        }
        ///2
        System.out.println("Task2");
        int i1 = 0;
        while (i1 < 10) {
            i1 = i1 + 1;
            System.out.print(i1);
        }
        int b = 10;
        for (; b > 1; ) {
            b = b - 1;
            System.out.print(b);
        }


        ///3
        System.out.println("task3");
        int Y = 12000000;
        for (i = 1; i < 10; i++) {
            int birthRate = 17 * Y / 1000;
            int dead = 8 * Y / 1000;
            Y = Y + birthRate - dead;
            System.out.println("Год" + i + "численность населения составляет" + Y);
        }
///4
        System.out.println("Task4");
        int contribution = (15000 * 7) / 100;
        int percent = contribution + 15000;
        int month = 1;
        contribution = contribution + percent;
        while (i <= 12000000) {
            month++;
            i = i + contribution;
            System.out.println("месяц" + month + "сумма накопления" + i + "рублей");
        }
        ///5
        System.out.println("Task5");
        int contribution1 = (15000 * 7) / 100;
        int percent1 = contribution1 + 15000;
        int month1 = 1;
        contribution = contribution + percent;
        while (i < 12000000) {
            month1++;
            i = percent1 + contribution1;
            if (month1 % 6 == 0) ;
            System.out.println("месяц" + month1 + "сумма накопления" + i + "рублей");

            {



            }
        }
        ///6
        System.out.println("Task6");
        int deposit = 15000;
        int month2 = 0;
        while (month2 < 108) {
            month2 = month2+6;
            deposit = deposit + deposit * 7 / 100;
            if (month2 % 6 == 0) {
            }
            System.out.println("сумма накоплений за" + month2 + "месяц равна" + deposit + "рублей");


        }
        ///7
        System.out.println("Task7");
        for (int i2 = 1; i2 < 31; i2=i2+6) {
            if (i2 % 7 == 0) {
            }
            System.out.println("сегодня пятница"+i2+"-е число,необходимо подготовить отчет");


        }

        ///8
        System.out.println("Task8");
        int juniorYear = 1823;
        int finalYear = 2123;
        int realYear = 2023;
        for (i=0;i<finalYear;i = i + 79)
            if (i>juniorYear){
                System.out.println(i);
            }
    }


}
