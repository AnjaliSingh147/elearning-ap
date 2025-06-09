package org.example.coadingpractice;

import java.util.HashMap;
import java.util.stream.Collectors;

public class Map1 {

  public static void main(String[] args) {
    HashMap<Integer,String> hmap =new HashMap<>();
    hmap.put(1,"java");
    hmap.put(2,"hadoop");
    hmap.put(3,"oracle");
    hmap.put(4,"unix");
    hmap.entrySet().stream().filter(e->e.getKey()>2).collect(Collectors.toList()).forEach(e-> System.out.println(e));
  }
}
