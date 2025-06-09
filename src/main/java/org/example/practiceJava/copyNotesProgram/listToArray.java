package org.example.practiceJava.copyNotesProgram;

import java.util.List;

public class listToArray {

  public static void main(String[] args) {
    List<String> list=List.of("apple","banana","orange");
    String[] strings = list.toArray(new String[0]);
 for(String str :strings)
 {
   System.out.println(str);
 }
  }
}
