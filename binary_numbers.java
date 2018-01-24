import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String b = Integer.toBinaryString(n);
        char[] array = b.toCharArray();
        int count = 1;
        int max = 0;
        for(int i=1; i<array.length; i++){ // Start from 1 since we want to compare it with the char in index 0
         if(array[i]==array[i-1] && array[i] == '1'){
                count++;
         }        else {
         if(count>max){  // Record current run length, is it the maximum?
            max=count;
         }
         count = 1; // Reset the count
     }
    }
   if(count>max){
    max=count; // This is to account for the last run
   }
       
        System.out.println(max); // Print the maximum.    }
   }
}
