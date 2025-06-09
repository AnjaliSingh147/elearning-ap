package org.example.practiceJava.copyNotesProgram;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import jdk.swing.interop.SwingInterOpUtils;

public class EmployeeMain {

  public static void main(String[] args) {
    ArrayList<Employee> emap = new ArrayList<>();
    emap.add(new Employee(1,"viku",785000.00));
    emap.add(new Employee(2,"amit",784502.00));
    emap.add(new Employee(3,"anu",45789456.00));
    emap.add(new Employee(4,"rahul",85201.00));

    //collect in map (sTRING ,DOUBLE)
    Map<String, Double> collect = emap.stream()
        .collect(Collectors.toMap(Employee::getName, Employee::getSalary));
    System.out.println(collect);
    //cllect in map (STRING ,DOUBLE) based on salary in descending order
    List<Employee> collect1 = emap.stream()
        .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
        .collect(Collectors.toList());

    System.out.println(collect1);
    //for average salary
    Double collect2 = emap.stream().collect(Collectors.averagingDouble(Employee::getSalary));
    System.out.println(collect2);
    //2 nd highest salary with name
    Map<String, Double> collect3 = emap.stream()
        .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).distinct().skip(1).limit(1)
        .collect(
            Collectors.toMap(Employee::getName, Employee::getSalary));
    System.out.println(collect3);
    // get the name which contains string an
    emap.stream().filter(e->e.getName().contains("an")).forEach(e-> System.out.println(e.getName()));
    //get the name which starts with a
    emap.stream().filter(e->e.getName().startsWith("v")).forEach(e-> System.out.println(e.getName()));
    Map<String, Long> collect4 = emap.stream()
        .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
    System.out.println(collect4);
    String collect5 = emap.stream().map(Employee::getName).collect(Collectors.joining(","));
    System.out.println(collect5);
    System.out.println(emap.stream().map(Employee::getName).collect(Collectors.joining(",")) );
  }


}

