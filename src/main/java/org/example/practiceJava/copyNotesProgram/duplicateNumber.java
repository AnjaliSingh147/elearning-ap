package org.example.practiceJava.copyNotesProgram;

import java.util.HashSet;

public class duplicateNumber {

  public static void main(String[] args) {
    String str= "coconut";
    HashSet<Character> set= new HashSet<>();
    for(int i=0;i<str.length();i++){
      set.add(str.charAt(i));
    }
    System.out.println(set);
    StringBuffer sb =new StringBuffer();
    for(Character c: set){
      sb.append(c);
    }
    System.out.println(sb);
  }
}
