
	import java.io.*;
	import java.util.*;

	public class JSr {

	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        StringBuilder sb = new StringBuilder(A); // It helps reverse string. wow
	        
	    if (A.equals(sb.reverse().toString())) {
	      System.out.println("Yes");
	    } else {
	      System.out.println("No");
	    }
	  }
	}





