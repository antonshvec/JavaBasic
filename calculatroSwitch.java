import java.util.Scanner;

class calculatorSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Привет. Я калькулятор ;)");
        System.out.println("Введите первую цифру:");
        int num1 = scan.nextInt();
        System.out.println("Введите действие:");
        System.out.println("(+) сложить");
        System.out.println("(-) вычесть");
        System.out.println("(*) умножить");
        System.out.println("(/) разделить)");
        Scanner input = new Scanner(System.in);
        char aktion = input.next().charAt(0);
        System.out.println("Введите вторую цифру:");
        int num2 = scan.nextInt();
        char plus = '+';
        char minus = '-';
        char umnoj = '*';
        char del = '/';
        
	}
}
