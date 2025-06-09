package org.example.coadingpractice;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurance {

  public static void main(String[] args) {
    String str ="aabcdd";
    //output 2a1b1c2d
    Arrays.stream(str.split(""))
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
        .entrySet().stream().forEach(e-> System.out.print(e.getValue()+e.getKey()));
  }
}
