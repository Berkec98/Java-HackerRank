import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ehsolution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            
                 int a = new Integer(scan.nextInt());
                 int b = new Integer(scan.nextInt());
            System.out.println(""+(a/b));
        }
            catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
            }
            catch(Exception e){
            System.out.println(e);
        }
        }
    }
