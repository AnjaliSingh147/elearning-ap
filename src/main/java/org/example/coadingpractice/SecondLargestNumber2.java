package org.example.coadingpractice;

public class SecondLargestNumber2 {

  public static void main(String[] args) {
    int [] arr= {10,20,60,70,70,70,69,69};
    int temp=0;
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[j]>arr[i]){
          temp=arr[j];
          arr[j]=arr[i];
          arr[i]=temp;

        }
        else if(arr[j]==arr[i]){
          arr[j]=0;
        }
      }
      if(i==1){
        break;
      }
    }
    System.out.println(arr[1]);
  }
}
