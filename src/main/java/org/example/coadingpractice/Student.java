package org.example.coadingpractice;

public class Student {
private String name ;
private double maths;
private double physics;
private double chemistry;
private double totalmarks ;
public Student(){
  super();
}
public Student(String name,double maths,double physics,double chemistry){
  this.name=name;
  this.maths=maths;
  this.physics=physics;
  this.chemistry=chemistry;
  this.totalmarks=maths+physics+chemistry;
}

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", maths=" + maths +
        ", physics=" + physics +
        ", chemistry=" + chemistry +
        ", totalmarks=" + totalmarks +
        '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getMaths() {
    return maths;
  }

  public void setMaths(double maths) {
    this.maths = maths;
  }

  public double getPhysics() {
    return physics;
  }

  public void setPhysics(double physics) {
    this.physics = physics;
  }

  public double getChemistry() {
    return chemistry;
  }

  public void setChemistry(double chemistry) {
    this.chemistry = chemistry;
  }

  public double getTotalmarks() {
    return totalmarks;
  }

  public void setTotalmarks(double totalmarks) {
    this.totalmarks = totalmarks;
  }
}
