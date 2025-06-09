package org.example.practiceJava.copyNotesProgram;

import java.util.List;

public class EmployeeList {
private String name;
private List<Integer> phoneNumbers;

public EmployeeList (String name, List<Integer> phoneNumber){
  this.name=name;
  this.phoneNumbers=phoneNumber;
}

  public EmployeeList() {
  super();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Integer> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<Integer> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  @Override
  public String toString() {
    return "EmployeeList{" +
        "name='" + name + '\'' +
        ", phoneNumbers=" + phoneNumbers +
        '}';
  }
}
