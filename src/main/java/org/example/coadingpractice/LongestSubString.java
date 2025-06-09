package org.example.coadingpractice;

import java.util.HashSet;

public class LongestSubString {

  public static void main(String[] args) {
    String str="abcaaaabcdefghabcd";
    //output =abcdefgh
    HashSet<Character> set =new HashSet<>();
    String strTillnow="";
    String longeststring="";
    for(int i=0;i<str.length();i++){
      char c=str.charAt(i);
      if(!set.contains(c)){
        set.add(c);
        strTillnow=strTillnow+c;
        if(strTillnow.length()>longeststring.length()){
          longeststring=strTillnow;
        }
      }
      else{
        set.clear();
        set.add(c);
        strTillnow=""+c;

      }

    }

    System.out.println(longeststring);
  }
}
