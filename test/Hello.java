/**
 * Hello
 */
package test;
import test.Loop;

public class Hello {

    public static void main(String[] args) {
        int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30; 
        String x = "Thank", y = "You"; 
        int[] numArray = {1, 2, 3, 4, 5};

        System.out.println(x + ' ' + y);
        System.out.println("Woohoo I almost get Java C...");
        System.out.println("a + b = " + (a + b)); 
        System.out.println("1 + 2 = " + addNumbers(1, 2));

        // Hello.loopNumbers(numArray);
        Loop.loopArray(numArray);
    }

    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static void loopNumbers(int[] array) {
        for(int i=0; i < array.length; i++ ){
            System.out.println(array[i]);
        }
    }
}