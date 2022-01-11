import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class hrbiginteger {
	
	  public static void main(String[] args) {
	        
	        Scanner scan = new Scanner(System.in);
	        String number = scan.nextLine();
	        String numberr = scan.nextLine();
	        BigInteger bigNum1 = new BigInteger(number);
	        BigInteger bigNum2 = new BigInteger(numberr);
	        System.out.println(bigNum1.add(bigNum2));
	        System.out.println(bigNum1.multiply(bigNum2));
	    }
	}

