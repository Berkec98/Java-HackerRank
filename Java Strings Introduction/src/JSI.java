

import java.io.*;
import java.util.*;

public class JSI {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        String A1 = A.substring(0, 1).toUpperCase();  // 0'dan 1'e kadar olan harfleri al -> b�y�t
        String bigLetter = A1 + A.substring(1);  // b�y�t�lm�� harfleri + 1.indexten sonras�n� yaz
        String B1 = B.substring(0, 1).toUpperCase(); 
        String bigLetter2 = B1 + B.substring(1);
        int i = A.compareTo(B);  // her karakterin farkl� bir de�eri var, kontrol et.
        if (i>0) {
            System.out.println(A.length() + B.length());
            System.out.println("Yes");
            System.out.println(bigLetter + " " + bigLetter2 );
        }
         else  {
             System.out.println(A.length() + B.length());
            System.out.println("No");
             System.out.println(bigLetter + " " + bigLetter2 );
         }
        }
    }

