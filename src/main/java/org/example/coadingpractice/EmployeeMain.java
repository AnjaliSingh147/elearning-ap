package org.example.coadingpractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

  public static void main(String[] args) {

    List<Employee> list = new ArrayList<>();
    list.add(new Employee("anjali",101, 178902));
    list.add(new Employee("viku",102,456789));
    list.add(new Employee("amit",103,7890623));
    list.add(new Employee("ram",104,2346456));
    list.add(new Employee("anu",103,7890623));
    list.add(new Employee("amarpalia",103,7890623));
    List<Employee>  a = list.stream().filter(e -> e.getName()
            .startsWith("a") && e.getSalary() > 10000).sorted(Comparator.comparing(Employee::getName))
        .sorted(Comparator.comparingDouble(Employee::getSalary)).collect(Collectors.toList());
    System.out.println(a);


  }
}