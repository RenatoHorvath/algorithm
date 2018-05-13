
package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    /**
     * @author Horváth Renátó 2018
     * 
     * output: 
     *          1
     *          12
     *          123 
     *          1234
     *          12345
     *          .
     *          .
     *          .
     *          12345X
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lines count : ");
        int userInt = scan.nextInt();
        for (int i = 1; i <= userInt; i++){
            System.out.print(" ");
            for (int j = 1; j <= userInt; j++)
                System.out.print (j > i ? " " : j);
        System.out.println();
        }
    }
}
