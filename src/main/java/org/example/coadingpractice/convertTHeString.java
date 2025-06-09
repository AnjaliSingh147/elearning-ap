package org.example.coadingpractice;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class convertTHeString {

  public static void main(String[] args) {
    String [] arr ={"1","2","3","4","5"};
    //output 1-2-3-4-5

    String join = String.join( "-",  arr);
    System.out.println(join);

  }
}
