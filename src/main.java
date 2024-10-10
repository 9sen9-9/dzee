import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class main {
    public static void main(String[] args) {
///1
        System.out.println(" task 1");
        for (int i = 1; i < 10; i = i+1) {
            System.out.println("Целые числа" + i);
        }
        ///2
        System.out.println("task 2");
        for (int i = 10; i > 0; i = i-1) {
            System.out.println("Целые числа" + i);
        }
        ///3
        System.out.println("task 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println("Целые числа" + i);
        }
        ///4
        System.out.println("task 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println("числа" + i);
        }
        ///5
        System.out.println("task5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println("год является високосным" + i);
        }
        ///6
        System.out.println("task6");
        for (int i = 7; i <= 100; i = i + 7) {
            System.out.println("Числа" + i);
        }
        ///7
        System.out.println("Task7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println("Числа" + i);
        }
        ///8
        System.out.println("Task8");
        int total = 0;
        int salary = 29000;
        for (int i = 1; i < 13; i = i + 1) {
            total = salary + total;
        }
        System.out.println(total);
        ///9
        System.out.println("Task9");
        int total1 = 0;
        int salary1 = 29000;
        for (int i = 1; i < 12; i++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + salary1;
            System.out.println("месяц" + i + "Итого" + total1);
        }
        ///10
        System.out.println("Task10");
        for (int i = 1; i <= 20; i++) {
            System.out.println("2*" + i + "=" + 2 * i);
        }

    }
}
