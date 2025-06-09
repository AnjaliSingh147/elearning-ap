package org.example.coadingpractice;

import java.util.Arrays;

public class LongestStringArray {

  public static void main(String[] args) {
String [] arr ={"anjali","rahul","vivek","Vikesh","viku","amit"};
    String s = Arrays.stream(arr)
        .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
    System.out.println(s);
  }
}
