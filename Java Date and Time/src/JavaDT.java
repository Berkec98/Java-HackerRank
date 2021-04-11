import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.time.LocalDate;

// It works in HackerRank. But did not work in Eclipse lol

class Result {
 public static String findDay(int month, int day, int year) 
    {
	  /* int d = Integer.valueOf(day);
         int m = Integer.valueOf(month);             I hope it works too.
         int y = Integer.valueOf(year);
         LocalDate date = LocalDate.of(y, m, d);
         return date.getDayOfWeek().toString(); */
	 
        Calendar date=Calendar.getInstance();
        date.set(year,month-1,day);        
    // January month is defined as index '0' in java class. So 12 is interpreted as december + 1  month. Use month-1
        
        int whichDay=date.get(Calendar.DAY_OF_WEEK);
        whichDay--;
        if(whichDay==0)
            whichDay=7;
        String dayOfWeek=new String();
        switch(whichDay)
        {
            case 1: dayOfWeek="MONDAY"; 
            break;
            case 2: dayOfWeek="TUESDAY"; 
            break;
            case 3: dayOfWeek="WEDNESDAY"; 
            break;
            case 4: dayOfWeek="THURSDAY"; 
            break;
            case 5: dayOfWeek="FRIDAY"; 
            break;
            case 6: dayOfWeek="SATURDAY"; 
            break;
            case 7: dayOfWeek="SUNDAY"; 
            break;
        }
           return dayOfWeek;
}
}

public class JavaDT {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);
        bufferedWriter.write(res);
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}

