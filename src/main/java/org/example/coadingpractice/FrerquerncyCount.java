package org.example.coadingpractice;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FrerquerncyCount {
//frequency count from single string
  public static void main(String[] args) {
  String str = "anjalisinghvikeshsingh";
  String strarray [] = str.split("");
  Map<String,Long> collect = Arrays.stream(strarray).collect(Collectors.groupingBy(e->e,Collectors.counting()));
    System.out.println(collect);
  }
}
