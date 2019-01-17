//Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.

import java.util.Scanner;

public class iter_1 {
    public static void main(String[] args) {
        Scanner consoleScaner = new Scanner(System.in);
        System.out.println("Введите число :");
        int number = consoleScaner.nextInt();
        System.out.println("Сумма цифр числа " + number + "=" + sumOfNumbers(number));
    }

    public static int sumOfNumbers(int number) {
        int sum = 0;
        for (int i = 10; i <= number * 10; i *= 10) {
            sum += (int) 10 * (number % i) / i;
            number -= number % i;
        }
        return sum;
    }
}
