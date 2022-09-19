import java.util.Scanner;

public class gameUefa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = 1;
        int number2 = 0;

        
        
        do {
        System.out.println("Привет. Давай поиграем в игру - угадай число. Я буду угадывать твое число.");
        System.out.println("Загадай число от 1 до 10.");
        System.out.println("Твое число меньше или больше 5?");
        System.out.println("1-Меньше 2-Больше");

        int answer = scanner.nextInt();
        if (answer == 1) {
            System.out.println("Твое число четное или нечетное?");
            System.out.println("1-Четное 2-Нечетное");
            int answer2 = scanner.nextInt();
            if (answer2 == 1) {
                System.out.println("Твое число 4?");
                System.out.println("1-Да 2-Нет");
                int answer3 = scanner.nextInt();
                if (answer3 == 1) {
                    System.out.println("Спасибо за игру!");
                } else {
                    System.out.println("Тогда твое число 2!");
                    System.out.println("Спасибо за игру!");
                }
            } else {
                System.out.println("Твое число 3?");
                System.out.println("1-Да 2-Нет");
                int answer4 = scanner.nextInt();
                if(answer4 == 1) {
                    System.out.println("Спасибо за игру!");
                } else {
                    System.out.println("Тогда твое число 1!");
                }
            }
        } else {
            System.out.println("Твое число четное или нечетное?");
            System.out.println("1-Четное 2-Нечетное");
            int answer5 = scanner.nextInt();
            if (answer5 == 1) {
                System.out.println("Твое число 10?");
                System.out.println("1-Да 2-Нет");
                int answer6 = scanner.nextInt();
                if (answer6 == 2) {
                    System.out.println("Твое число 8?");
                    System.out.println("1-Да 2-Нет");
                    int answer7 = scanner.nextInt();
                    if (answer7 == 1) {
                        System.out.println("Спасибо за игру!");
                    } else {
                        System.out.println("Тогда твое число 6!");
                        System.out.println("Спасибо за игру!");
                    }
                } else {
                    System.out.println("Спасибо за игру!");
                }
            } else if (answer5 == 2) {
                System.out.println("Твое число 9?");
                System.out.println("1-Да 2-Нет");
                int answer7 = scanner.nextInt();
                if (answer7 == 1) {
                    System.out.println("Спасибо за игру!");
                } else if (answer7 == 2) {
                    System.out.println("Твое число 7?");
                    System.out.println("1-Да 2-Нет");
                    int answer8 = scanner.nextInt();
                    if(answer8 == 1) {
                        System.out.println("Спасибо за игру!");
                    } else {
                        System.out.println("Тогда твое число 5!");
                    } 
                } 
            }
        } System.out.println("Cыграем еще раз ?");
          System.out.println("1-Да 2-Нет");
         
          
    } while (scanner.nextInt() == 1);
   }
}

