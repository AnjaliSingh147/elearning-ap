package org.example.coadingpractice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondRepeatedElement {

  public static void main(String[] args) {
    String str ="ilovejavatechi";
    Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
        .entrySet().stream().filter(e->e.getValue()>1).skip(1).limit(1).forEach(e-> System.out.print(e.getKey()));
  }

}
