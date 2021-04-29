
import java.util.*;
import java.text.*;

public class JCF {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);   // It makes the number to Dollar.
        String us = n.format(payment);                            // n format(payment)
        NumberFormat in = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = in.format(payment);
        NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = ch.format(payment);
        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = fr.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}