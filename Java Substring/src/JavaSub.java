
	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class JavaSub {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String S = in.next();
	        int start = in.nextInt();
	        int end = in.nextInt();
	        String ss = S.substring(start,end); // from startth index to end.
	        System.out.println(ss);
	    }
	}


