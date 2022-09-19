/**
 *  Java Basic. Homework #4
 * 
 * @author Shvets Anton
 * @todo 17.09.22
 * @date  19.09.22
 */

import java.util.Scanner;

class calculatorSwi {
    public static void main(String[] args) {
        
        int number1 = 1;
        int number2 = 0;
        
        
        Scanner scanOperands = new Scanner(System.in);
        do {
        System.out.println("Привет. Я калькулятор.");
        
        System.out.println("Введите первую цифру:");
        float num1 = scanOperands.nextFloat();

        Scanner inputAction = new Scanner(System.in);
        System.out.println("Введите действие:");
        System.out.println("(+) сложить");
        System.out.println("(-) вычесть");
        System.out.println("(*) умножить");
        System.out.println("(/) разделить");
        char action = inputAction.next().charAt(0);

        System.out.println("Введите вторую цифру:");
        float num2 = scanOperands.nextFloat();

        float res = 0;

        switch (action) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Ошибка. На 0 делить нельзя.");
                    return;
                } else {
                    res = num1 / num2;
                }
                break;
            default:
                System.out.println("Ошибка. Попробуйте еще раз.");
        }
        System.out.println("Результат:" + res);
        System.out.println("Обнулить калькулятор?");
        System.out.println("1-Да 2-Нет");
    } while (scanOperands.nextInt() == 1);
    }
}
