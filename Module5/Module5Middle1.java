import java.util.Scanner;
//Задан массив целочисленных чисел, вывести сумму всех чисел массива.
public class Module5Middle1 {
    public static void main(String[] args) {
        int[] nums = {4, 6, -6, 0, -2, 8};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("Сумма: " + sum);
    }
}
