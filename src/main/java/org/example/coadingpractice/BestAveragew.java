  package org.example.coadingpractice;

  import java.util.Arrays;
  import java.util.Comparator;
  import java.util.Map;
  import java.util.Map.Entry;
  import java.util.stream.Collectors;

  public class BestAveragew {

    public static void main(String[] args) {
      String [][] scores ={{"Bob","87"},{"Mark","100"},{"charles","63"},{"Mark","22"}};
      Entry<String, Double> stringDoubleEntry = Arrays.stream(scores)
          .collect(Collectors.groupingBy(score -> score[0], Collectors.mapping(
              score -> Double.parseDouble(score[1]),
              Collectors.averagingDouble(Double::doubleValue)))).entrySet().stream()
          .max(Entry.comparingByValue()).get();
      System.out.println(stringDoubleEntry);
      System.out.println("/////////////////////");
      Map<String, Double> collect = Arrays.stream(scores)
          .collect(Collectors.groupingBy(score -> score[0], Collectors.mapping(
              score -> Double.parseDouble(score[1]),
              Collectors.averagingDouble(Double::doubleValue))));
      System.out.println(collect);
    }
  }
