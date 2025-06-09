package org.example.coadingpractice;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNumber {

  public static void main(String[] args) {
    int [] arr ={5,9,11,2,8,21,1};
    Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).distinct().skip(1).limit(1).forEach(e-> System.out.print(e));
  }
}
