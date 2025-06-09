package org.example.coadingpractice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonREpeatingChractetr {

  public static void main(String[] args) {
    String str ="anjalisinghvikeshSingh";
    Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(e->e.getValue()==1)
        .forEach((stra)-> System.out.print(stra+" "));
    System.out.println("////////////////////////");
    Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(e->e.getValue()>1)
        .forEach((stra)-> System.out.print(stra+" "));
  }
}
