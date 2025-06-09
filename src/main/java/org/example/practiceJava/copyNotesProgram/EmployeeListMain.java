package org.example.practiceJava.copyNotesProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeListMain {
public static void main(String [] args) {

  ArrayList<EmployeeList> list = new ArrayList<>();
  //1 Insert the value in EmployeeList
  list.add(new EmployeeList("anu", List.of(456123, 789456)));
  list.add(new EmployeeList("viku", List.of(741852, 852963, 753951)));
  list.add(new EmployeeList("amit", List.of(159753, 4561233, 789456)));
  list.add(new EmployeeList("rahul", List.of(147852, 753951, 1452, 456127)));

  //2 Only print phone Numbers (i.e streams of phoneNumber)

  List<Integer> collect = list.stream()
      .flatMap(employeeList -> employeeList.getPhoneNumbers().stream())
      .collect(Collectors.toList());

  System.out.println(collect);
  //print count the name
  Map<String, Long> collect1 = list.stream()
      .collect(Collectors.groupingBy(EmployeeList::getName, Collectors.counting()));
  System.out.println(collect1);
  //print count the phoneNumber and along the name
  Map<List<Integer>, Long> collect2 = list.stream()
      .collect(Collectors.groupingBy(EmployeeList::getPhoneNumbers, Collectors.counting()));
  //list.stream().collect(Collectors.toMap(EmployeeList::getName,collect2));
  Map<String, List<Integer>> collect3 = list.stream()
      .collect(Collectors.toMap(EmployeeList::getName, EmployeeList::getPhoneNumbers));
  System.out.println("///////////////////");
  collect3.entrySet().stream().forEach(e-> System.out.println(e.getKey()+" total phone number="+e.getValue().size()));
//normal print for employee class
 list.stream()
      .collect(Collectors.toMap(EmployeeList::getName, EmployeeList::getPhoneNumbers))
     .entrySet().stream().forEach(e-> System.out.println(e.getKey()+"  "+e.getValue()));


}
}
