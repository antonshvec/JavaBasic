/**
 *  Java Basic. Homework #2
 * 
 * @author Shvets Anton
 * @todo 07.09.22
 * @date  10.09.22
 */
 
class dz2September {
    public static void main(String[] args) {
        System.out.println(checkWeather(0));
        System.out.println(canWalk(true,false));
        System.out.println(methodSlojeniya(5,3));
        System.out.println(methodVichitaniya(9,5));
        System.out.println(methodUmnojeniya(9,5));
        System.out.println(methodDeleniya(5,3));
        System.out.println(dayOfWeek(7));
        System.out.println(dayOfWeek2(7));
        System.out.println(canBuyFood(true,false));

    }
    
        //task 1
        
    static String checkWeather(int temperature) {
        if (temperature  <= 0) {
        return "It’s frost";
        } else if (temperature <=18) {
        return "It’s cold";
        } else if (temperature <=28) {
        return "It’s warm";
        } else if(temperature >=29) {
        } return "It’s hot";
    }

        //Task2
        
    static boolean canWalk(boolean isWeekend,boolean isRain) {
        if (isWeekend && !isRain) {
        return true;
        } else {
        }
        return false;
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
        static double methodDeleniya(int a, int b) {
        double c = (double) a / b;
        return c;
    }
        
        //Task 4
        
        static String dayOfWeek(int b) {
            
            switch (b) {
                case 1:
                return "monday";
                case 2: 
                return "tuesday";
                case 3:
                 return "wednesday";
                case 4:
                return "thursday";
                case 5:
                 return "friday";
                case 6
                : return "saturday";
                case 7
                : return "sunday";
                default:
                 return "enter another number";
                }
            }
        
        //task4-1
                
        static int  dayOfWeek2(int day) {
                
        switch (day) {
        case 1:
        System.out.println("monday");
        break;
        case 2: 
        System.out.println("tuesday");
        break;
        case 3: 
        System.out.println("wednesday");
        break;
        case 4:
        System.out.println("thursday");
        break;
        case 5: 
        System.out.println("friday");
        break;
        case 6: 
        System.out.println("saturday");
        break;
        case 7: 
        System.out.println("sunday");
        break;
        default:
        System.out.println("enter another number");
        }
        return day;
    }

        //task5
        
        static boolean canBuyFood(boolean isLidlOpen, boolean  isTescoOpen) {
            if (isLidlOpen && isTescoOpen) {
            System.out.println("I can buy food in Lidl and Tesco");
            return true;
            } else if (isLidlOpen && !isTescoOpen) {
            System.out.println("I can’t buy food in Lidl");
            return true;
            } else if (!isLidlOpen && isTescoOpen) {
            System.out.println("I can’t buy food in Tesco");
            return true;
            }else if (!isLidlOpen && !isTescoOpen) {
            System.out.println("I can’t buy food");
            return false;
            } else {
            System.out.println("I can’t buy food anywhere");
            }return false;
    }
}













