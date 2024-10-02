
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

    }
}