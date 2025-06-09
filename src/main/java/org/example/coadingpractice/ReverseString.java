package org.example.coadingpractice;

import java.util.HashSet;

public class ReverseString {

  public static void main(String[] args) {
    //StringString
    String str="Welcome to Java";
    String [] strarray=str.split(" ");
    String reverseString="";


HashSet<String> set =new HashSet<>();
for(String s:strarray){
String reverseword="";
 for(int i=s.length()-1;i>=0;i--){
   reverseword =reverseword+ s.charAt(i);
}
  reverseString=reverseString+reverseword+" ";
    }
    System.out.println(reverseString);
  }
}
