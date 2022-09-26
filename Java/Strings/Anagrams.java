/*
Two strings AA and BB are called anagrams if they consist same characters, but may be in different orders. So the list of anagrams of CAT are "CAT", "ACT" , "TAC", "TCA" ,"ATC" and "CTA".

Given two strings, print "Anagrams" if they are anagrams, print "Not Anagrams" if they are not. The strings may consist at most 50 english characters, the comparison should NOT be case sensitive.

This exercise will verify that you are able to sort the characters of a string, or compare frequencies of characters.

Sample Input 1
anagram
margana

Sample Output 1:
Anagrams
*/

import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String A, String B) {
         A=A.toLowerCase();
       B=B.toLowerCase();
       boolean f = false;
      char[] c = A.toCharArray();
      
      for (int i = 0; i < c.length; i++)
      {  
          for (int j = i + 1; j < c.length; j++)   
          {  
            char tmp;  
            if (c[i] > c[j])   
            {  
            tmp = c[i];  
            c[i] = c[j];  
            c[j] = tmp;  
            }  
          }  
      }
      char[] d = B.toCharArray();
      
      for (int i = 0; i < d.length; i++)
      {  
          for (int j = i + 1; j < d.length; j++)   
          {  
            char tmp;  
            if (d[i] > d[j])   
            {  
            tmp = d[i];  
            d[i] = d[j];  
            d[j] = tmp;  
            }  
          }  
      }
      String a = new String (c);
      String b = new String (d);
      if (a.equals(b)) {
          f=true;
      }
      return f;
    }
  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

