package org.example.coadingpractice;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Map {

  public static void main(String[] args) {
    HashMap<Integer,String> hmap=new HashMap<>();
    hmap.put(1,"java");
    hmap.put(2,"hadoop");
    hmap.put(3,"oracle");
    hmap.put(4,"unix");
    hmap.put(5,"linux");
    List<Entry<Integer, String>> collect = hmap.entrySet().stream().filter(e -> e.getKey() > 4)
        .collect(Collectors.toList());

    System.out.println(collect);
  }
}
