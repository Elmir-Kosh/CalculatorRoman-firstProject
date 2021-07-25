import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class Solution {
    private static String firstNumber;
    private static String secondNumber;ббб
    private static String operation;
    private static String[] correctValues = {"minusone", "minustwo", "minusthree", "minusfour", "minusfive", "minussix",
            "minusseven", "minuseight", "minusnine", "minusten", "null", "one", "two", "three", "four", "five", "six",
            "seven", "eight", "nine", "ten"};
    private static String[] correctOperations = {"+", "-", "*", "/"};
    private static String answer;

    public static void main(String[] args) {

        do {

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Введите прописью на английском языке первое число, от -10 до 10 (minusone, null, one...)");
            while (true) {
                firstNumber = keyboard.next();
                boolean b = Arrays.asList(correctValues).contains(firstNumber);
                if (b == true) {
                    break;
                } else System.out.println("Введите корректное значение");
            }

            System.out.println("Введите прописью на английском языке второе число, от -10 до 10 (minusone, null, one...)");
            while (true) {
                secondNumber = keyboard.next();
                boolean b = Arrays.asList(correctValues).contains(secondNumber);
                if (b == true) {
                    break;
                } else System.out.println("Введите корректное значение");
            }

            System.out.println("Выберите необходимое арифметическое действие (\"+\",\"-\",\"*\", \"/\")");


            while (true) {
                operation = keyboard.next();
                if (operation.equalsIgnoreCase("/") && secondNumber.equalsIgnoreCase("null")) {
                    System.out.println("Делить на ноль нельзя! Выберите другое действие!");
                    continue;
                }

                boolean b = Arrays.asList(correctOperations).contains(operation);
                if (b == true) {
                    break;
                } else System.out.println("Введите корректное арифметическое действие");
            }


            double result = ArithmeticOperations.arithmeticOperation(firstNumber, secondNumber, operation);
            System.out.println("Ответ равен: " + ConversionToRoman.conversionToRoman(result));
            System.out.println("Если Вы хотите начать заново введите \"again\", если хотите завершить программу - \"exit\"");
            while(true) {
                answer = keyboard.next();
                if (answer.equalsIgnoreCase("again") || answer.equalsIgnoreCase("exit")) {
                    if (answer.equalsIgnoreCase("exit")) {
                        break;}
                    break;
                }
                else System.out.println("Введите корректное значение");
            }
        }
        while (answer.equalsIgnoreCase("again"));







    }
}



