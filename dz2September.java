/**
 * 
 * 
 * @author Shvets Anton
 * @todo 07.09.22
 * @date  10.09.22
 */
 
class dz2September {
    public static void main(String[] args) {
        checkWeather();
        canWalk();
        methodSlojeniya(9,5);
        methodVichitaniya(9,5);
        methodUmnojeniya(9,5);
        methodDeleniya(5,3);
    }
    
        //task 1
        
    static String checkWeather() {
        int temperature = 25;
        if (temperature  <= 0  ) {
           System.out.println("It’s frost");
        } else if (temperature <=18 ) {
           System.out.println("It’s cold");
        } else if (temperature <=28 ) {
           System.out.println("It’s warm");
        } else if (temperature >=29 ) {
           System.out.println("It’s hot");
        }
          else {
           System.out.println("");
        }
        return "";
}
        //Task2
        
    static boolean canWalk() {
        boolean isWeekend = true;
        boolean isRain = false;
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
        System.out.println(c);
        return c;
    }
        static int methodVichitaniya(int a, int b) {
        int c = a - b;
        System.out.println(c);
        return c;
    
}
        static int methodUmnojeniya(int a, int b) {
        int c = a * b;
        System.out.println(c);
        return c;
}
        static int methodDeleniya(int a, int b) {
        int c = a / b;
        System.out.println((double) a / b);
        return c;
    }
}











