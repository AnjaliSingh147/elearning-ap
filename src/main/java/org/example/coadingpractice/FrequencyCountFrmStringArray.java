package org.example.coadingpractice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCountFrmStringArray {

  public static void main(String[] args) {
    String [] array={"vikesh","ram","krishna","anjali","maa","ram","krishna"};
    Map<String,Long> collect=Arrays.stream(array).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
  System.out.println(collect);
  }

}
