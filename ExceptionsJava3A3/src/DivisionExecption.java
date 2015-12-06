
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */


public class DivisionExecption {


     static  int x =20;
     static int y ;
          public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         do{
//         System.out.println(" Enter un entier");
//             y = scanner.nextInt();
//           
//            }while(y==0);
//          System.out.println(x/y);
              
              Scanner scanner = new Scanner(System.in);
        
         System.out.println(" Enter un entier");
         y = scanner.nextInt();    
         try{
          System.out.println(x/y);
         }
         catch(ArithmeticException ex){
             System.out.println(ex.getMessage());
         }
    }


}
