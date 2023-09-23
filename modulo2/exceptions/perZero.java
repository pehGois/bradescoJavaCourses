package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class perZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try { 
            System.out.println("Número: ");
            int a = s.nextInt();
            System.out.println("Divisor: ");
            int b =s.nextInt();
            System.out.println(a/b);
        }
        catch(InputMismatchException eMismatchException){
            System.out.println("InputMismatchException");
        }
        catch(Throwable eThrowable){
            System.out.println("Throwable");
        }
        
        finally {
            s.close();
        }
    }
}
