//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> map = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name, phone);
        } 
        while(in.hasNext()){
            String s = in.next();
            
            if(map.containsKey(s)){
            int value = map.get(s);
            System.out.println(s +"=" + value);}
            else {      
                System.out.println("Not found");
            }
                
        }
        
        in.close();
    }
}