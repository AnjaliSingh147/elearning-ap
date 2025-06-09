package org.example.practiceJava.copyNotesProgram;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseString {

  public static void main(String[] args) {
    String str = "Welcome To java";
    String[] strarray = str.split(" ");
    String reverseString ="";
    for(String c:strarray){
      String reversewords="";
      for(int i=c.length()-1;i>=0;i--){
        reversewords=reversewords+c.charAt(i);
      }
      reverseString=reverseString+reversewords+" ";
    }
    System.out.println(reverseString);
  }
}