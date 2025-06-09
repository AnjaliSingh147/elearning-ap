package org.example.practiceJava.copyNotesProgram;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

  public static void main(String[] args) {
    String [] array={"apple","banana","orange"};
    List<String> list= Arrays.asList(array);
    System.out.println(list);
    //list to find an
    list.stream().filter(e->e.contains("an")).forEach(e-> System.out.println(e));
  }
}
