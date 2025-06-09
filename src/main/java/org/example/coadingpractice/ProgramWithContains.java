package org.example.coadingpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramWithContains {

  public static void main(String[] args) {
    String [] arr ={"Apple","Nayak","Banana","Orange"};
    List<String> list =  new ArrayList<>();
    for(int i=0;i< arr.length;i++){
      list.add(arr[i]);
    }
    List<String> str =list.stream().filter(s->s.contains("n")||s.contains("N")).collect(Collectors.toList());
    System.out.println(str);

  }
}
