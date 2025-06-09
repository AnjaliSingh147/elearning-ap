package org.example.coadingpractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringPrint {

  public static void main(String[] args) {
    String str [] ={"anu","vikesh","abhi","sunil"};
    List<String> anu = Arrays.stream(str).filter(e -> e.contentEquals("anu"))
        .collect(Collectors.toList());
    System.out.println(anu);
  }
}
