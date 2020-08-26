import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         String ans= "";
         if(n%2==1){
             ans = "Wired";
         }
         else{
             if(n >=6 && n <=20)
             {
                 ans = "Weird";
             }

             else{
                 ans = "Not wired";
             }
         }
         System.out.println(ans);
    }
}
