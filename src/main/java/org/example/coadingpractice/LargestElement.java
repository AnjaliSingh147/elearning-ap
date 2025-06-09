package org.example.coadingpractice;

import java.util.Comparator;
import java.util.List;

public class LargestElement {

  public static void main(String[] args) {
    List<Integer> list=List.of(20,30,40,10,50,60,20,30,40);
    list.stream().sorted().distinct().filter(e->e%20==0).forEach(e-> System.out.println(e));
    list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).limit(1).forEach(e-> System.out.println(e));
  }
}
