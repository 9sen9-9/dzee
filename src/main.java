import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class main {
    public static void main(String[] args) {
///1
        int age = 18;
        if (age >= 18) ;
        {
            System.out.println("Если возраст человека равен" + age + "то он совершеннолетний");
            {
            }
            int age1 = 17;
            if (age >= 18) ;
            System.out.println("Если возраст человека равен" + age1 + "он не достиг совершеннолетия, нужно немного подождать");
        }


        /// 2
        int degree = 5;
        if (degree < 5) ;
        System.out.println("На улице" + degree + "нужно надеть шапку");
        if (degree > 5) ;
        System.out.println("На улице" + degree + "можно идти без шапки");


        /// 3
        int speed = 60;
        if (speed > 60) ;
        System.out.println("если скорость" + speed + "придется заплатить штраф");
        if (speed < 60) ;
        System.out.println("если скорость" + speed + "можно ездить спокойно");


        /// 4
        int human = 2;
        if (human >= 2 && human <= 6) ;
        System.out.println("Если возраст человека равен" + human + "то ему нужно ходить в детский сад");
        if (human >= 7 && human <= 17) ;
        System.out.println("Если возраст человека равен" + human + "то ему нужно ходить в школу");
        if (human >= 18 && human <= 24) ;
        System.out.println("Если возраст человека равен" + human + "то его место в университете");
        if (human > 24) ;
        System.out.println("Если возраст человека равен " + human + "то ему пора ходить на работу ");
        ///5
        age = 13;
        boolean child = false;
        if (age < 5 || child) ;
        System.out.println("если возраст ребенка равен" + age + "то ему можно кататься на аттракционе");
     else if (age > 5 && age < 14 && child) ;
        System.out.println("если возраст ребенка равен" + age + "то ему можно кататься на аттракционе в сопровождении ");
     else if (age > 14) ;
        System.out.println("если возраст ребенка равен" + age + "то ему можно кататься без сопровождения ");
        ///6
        int wagon = 100;
        int place = 58;
        if (place < 60 && wagon < 102) ;
        System.out.println("в вагоне есть сидячие места");
     else if (place == 60 && wagon<102);
        System.out.println("В вагоне есть стоячие места");
        else
        System.out.println("вагон полностью забит");

///7
        int one =1;
        int two =2;
        int three =3;
        if (one>two && one>three);
        else
        System.out.println("наибольшее число 3");




    }
}