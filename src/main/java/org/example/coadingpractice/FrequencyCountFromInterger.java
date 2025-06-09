package org.example.coadingpractice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyCountFromInterger {

  public static void main(String[] args) {

    int[] arr = {20, 30, 10, 20, 30, 40, 56, 78, 89, 89, 89, 90};
    Map<Integer,Long> collect=Arrays.stream(arr).boxed().collect(Collectors.groupingBy(e->e,Collectors.counting()));
    System.out.println(collect);
  }
}
