package org.example.coadingpractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestElement {


  public static void main(String[] args) {

    List<Integer> arr= List.of(10,20,30,40,50,60,70,30,40,50,60,30,40,56,70,56);
    arr.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).limit(1).forEach(e-> System.out.println(e));

  }
}
