package org.example.coadingpractice;

import java.util.Arrays;

public class PowerOf10 {

  public static void main(String[] args) {
    int [] num={100,20,34,67,78,98,2000};
    Arrays.stream(num).boxed().filter(e->e%10==0).forEach(e-> System.out.println(e             ));
  }
}
