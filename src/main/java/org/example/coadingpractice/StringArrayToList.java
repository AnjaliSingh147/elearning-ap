package org.example.coadingpractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringArrayToList {

  public static void main(String[] args) {
    String str ="anjali";
    List<Character> collect = Arrays.stream(str.split(""))
        .flatMapToInt(String::chars)
        .mapToObj(c -> (char) c).collect(Collectors.toList());
    System.out.println(collect);
    System.out.println("////////////////");
    String str1 = "hello";

    List<Character> list = str1.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.toList());
    System.out.println(list);
  }
}
