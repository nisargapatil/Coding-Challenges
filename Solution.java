import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
      int a = s.length();
      char[]ar = s.toCharArray();
      long o = n/a;
      long u = n%a;
      int v = (int)u;
      long count =0;
      
      if (s.equals("a")){
        return n;
      }
       else{   
        for(int i =0; i<a; i++){
            if (ar[i]=='a'){
                count++;
              }} }
      count*=o;
      for (int j=0; j<v; j++){
          if (ar[j]=='a'){
                  count++;
              }
      }
      System.out.println(count);
      return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
        System.out.println("This is my solution for a HackerRank challenge.");

    }
}
