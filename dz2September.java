/**
 *  Java Basic. Homework #2
 * 
 * @author Shvets Anton
 * @todo 07.09.22
 * @date  10.09.22
 */
 
class dz2September {
    public static void main(String[] args) {
        checkWeather(0);
        canWalk(true,false);
        int a = methodSlojeniya(5,3);
        int b =  methodVichitaniya(9,5);
        int c = methodUmnojeniya(9,5);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        methodDeleniya(5,3);
    }
    
        //task 1
        
    static String checkWeather(int temperature) {
        if (temperature  <= 0  ) {
        System.out.println("It’s frost");
        } else if (temperature <=18 ) {
        System.out.println("It’s cold");
        } else if (temperature <=28 ) {
        System.out.println("It’s warm");
        } else if (temperature >=29 ) {
        System.out.println("It’s hot");
        }
        return "";
    }
        //Task2
        
    static boolean canWalk(boolean isWeekend,boolean isRain) {
        if (isWeekend && !isRain) {
        System.out.println("Можно гулять");
        } else {
        System.out.println("Гулять нельзя");
        }
        return true;
        }
        
        //task3
        
        static int methodSlojeniya(int a, int b) {
        int c = a + b;
        return c;
    }
        static int methodVichitaniya(int a, int b) {
        int c = a - b;
        return c;
    
}
        static int methodUmnojeniya(int a, int b) {
        int c = a * b;
        return c;
}
        static int methodDeleniya(int a, int b) {
        int c = a / b;
        System.out.println((double)a / b);
        return c;
    }
}










