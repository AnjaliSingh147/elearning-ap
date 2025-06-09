package org.example.coadingpractice;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.example.Main;

public class StartsWith1 {

  public static void main(String[] args) {
    int [] irr ={5,9,11,11,12,2,8,21};
     Arrays.stream(irr).boxed().map(e -> e + "").filter(e->e.startsWith("1")).distinct().forEach(e-> System.out.println(e));
    System.out.println("////////////////////////////////");
     Arrays.stream(irr).boxed().map(e->e+"").filter(e->e.contains("1")).distinct().forEach(e-> System.out.println(e));
  }
}
