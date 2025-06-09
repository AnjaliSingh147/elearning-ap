package org.example.coadingpractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.example.practiceJava.copyNotesProgram.Employee;

public class StrudentMain {

  public static void main(String[] args) {
    ArrayList<Student> stu = new ArrayList<>();
    stu.add(new Student("anu", 100, 99, 100));
    stu.add(new Student("viku", 89, 90, 90));
    stu.add(new Student("amit", 89, 58, 89));
    stu.add(new Student("ram", 100, 100, 100));
    //stu.add(new Student("sitamaa", 100, 100, 100));

    //print student name based on totalmarks
    stu.stream()
        .sorted(Comparator.comparingDouble(Student::getTotalmarks).reversed())
        .forEach(e -> System.out.println(e.getName() + " = " + e.getTotalmarks()));
//print the name of student based on averagemarks
    Map<String, Double> collect = stu.stream().collect(Collectors.groupingBy(Student::getName,
        Collectors.averagingDouble(Student::getTotalmarks)));
    System.out.println(collect);

    //short the student which contains "a" and print the percentage
    List<Double> collect1 = stu.stream().map(e -> e.getTotalmarks() / 300 * 100)
        .collect(Collectors.toList());
     stu.stream().filter(e -> e.getName().contains("a")).
        map(e ->e.getName()+":"+ (e.getTotalmarks() / 300.0 * 100)+"%").forEach(System.out::println);
//compare the totalmarks in assending order
    List<Student> collect2 = stu.stream().sorted(Comparator.comparingDouble(Student::getTotalmarks))
        .collect(Collectors.toList());
    System.out.println(collect2);
    //compare the total marks based on totalmarks in descending order
    List<Student> collect3 = stu.stream()
        .sorted(Comparator.comparingDouble(Student::getTotalmarks).reversed())
        .collect(Collectors.toList());
    System.out.println(collect3);
// 2ND LARGEST TOTALMARKS
    System.out.println("/////////////////////////");
    stu.stream()
        .sorted(Comparator.comparingDouble(Student::getTotalmarks).reversed()).distinct().skip(1).limit(1)
        .forEach(e-> System.out.println(e.getTotalmarks()));

    // 2nd largest number

  }}