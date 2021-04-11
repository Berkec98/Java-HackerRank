import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaEOF {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 1;
        while(scan.hasNext()) {
            String str = scan.nextLine();
            System.out.println(x + " " + str);
            x++;
        }
    }
}