/**
 *  Java Basic. Homework #3
 * 
 * @author Shvets Anton
 * @todo 12.09.22
 * @date  .09.22
 */
 
class Homework3 {
    public static void main(String[] args) {
        int[] mass2 = {65, 3, 43, 12, 265, 80};
            printArray(mass2);
            int[] bass2 = {65, 3, 500, 12, 265, 80};
    }
    
    //task1
    
    static void printArray(int[] mass2) {
    
    System.out.print('[');
        for (int i = 0; i < mass2.length;i++) {
        System.out.print(mass2[i]);
        if (i < mass2.length - 1) {
            System.out.print(", ");
            }
        } 
        System.out.println(']');
    }
    
    //task2
    
   static int getMax(int[] bass2) {
       
       int max = bass2[0];
        for (int i = 1; i < bass2.length;i++) {
        if (bass2[i] > max) {
            max = bass2[i];
            }
        } return max;
    }
    //taks3
}
