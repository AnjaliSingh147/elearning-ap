package org.example.coadingpractice;

public class MissingProgram {

  public static void main(String[] args) {
    int [] arr ={1,2,5,3,4,7};
    int n=arr.length+1;
    int sum=0;
    int z=0;
    for(int i=0;i< arr.length;i++){
      sum=sum+arr[i];
    }
    n=n*(n+1)/2;
    z=n-sum;
    System.out.println(z);
  }

}
