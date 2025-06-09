package org.example.coadingpractice;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindUniqueElements {

  public static void main(String[] args) {
    String str ="ilovejavatechi";
    Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
        .entrySet().stream().filter(e->e.getValue()==1).forEach(e-> System.out.print(e.getKey()));
  }
}
