package org.example.coadingpractice;

import java.util.List;

public class SecondLargestElementsec2 {

  public static void main(String[] args) {
    int [] arr= {10,20,60,70,70,69};
    int largest =Integer.MIN_VALUE;
    int secondlargest =Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      if(arr[i]>largest){
        secondlargest=largest;
        largest =arr[i];
      }
      else if(arr[i]>secondlargest&&arr[i]!=largest){
        secondlargest=arr[i];
      }
    }
    if(secondlargest==Integer.MIN_VALUE){
      System.out.println("there is no sdecond largest element");
    }
    else{
      System.out.println("second largest number "+secondlargest);
    }
  }
}
