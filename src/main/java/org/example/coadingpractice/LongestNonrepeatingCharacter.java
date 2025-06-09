package org.example.coadingpractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestNonrepeatingCharacter {

  public static void main(String[] args) {
    int [] arr ={1,2,3,4,5,1,3,4,6,6,7,8,9,9,5,2};
    //output=6

    Integer key = Arrays.stream(arr).boxed()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .entrySet().stream().filter(e -> e.getValue() == 1).max(Entry.comparingByKey()).get()
        .getKey();
    System.out.println(key);
  }
}
