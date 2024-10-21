import javax.swing.*;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class main {
    public static void main(String[] args) {
///1.2
        System.out.println("Task1,2");
        int[] numbers = new int[]{1, 2, 3};
        numbers[0] = 1;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ",");
        }
        System.out.println();
        double[] arr = {1.57, 7.654, 9.986};
        arr[0] = 1.57;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(",");
        }
        System.out.println();


        {

            System.out.println("Task3");
            int[] numbers1 = {1, 2, 3};
            numbers[0] = 1;
            for (int i1 = 0; i1 >= numbers.length; i1--) {
                System.out.println(numbers[i1] + ",");
            }

            double[] arr1 = {1.57, 7.654, 9.986};
            arr1[0] = 1.57;
            for (int i1 = 0; i1 >= arr1.length; i1--) {
                System.out.print(arr1[i1] + ",");

            }
            System.out.println("Task4");
            int[] code = {1, 2, 3};
            for (int i = 0; i < code.length; i++) {
                if (code[i] % 2 != 0) {
                    code[i] = code[i] + 1;
                }
            }
            System.out.print(Arrays.toString(code));


        }}}

