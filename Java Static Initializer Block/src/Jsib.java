import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

    public class Jsib {
      static Scanner scan = new Scanner(System.in);
      static boolean flag = true;
      static int B = scan.nextInt();
      static int H = scan.nextInt();
 
     static {
        if(B<=0 || H<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
             flag = false;   
        }
        else{}
    }
 
  public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}	
	}
}
    
    /* public class Main {
 
     static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  
  public static void main(String[ ] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would output an error

    Main myObj = new Main(); // Create an object of Main
    myObj.myPublicMethod(); // Call the public method
  }
}
*/
