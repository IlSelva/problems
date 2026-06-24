package com.ilselva.problems.neetcode.neetcode150.arrayshashing.solutions;

public class ValidPalindrome {

  public boolean isPalindrome(String s) {
    int i=0;
    int j=s.length()-1;
    char[] chars = s.toCharArray();

    while(i<j){
      if(!Character.isLetterOrDigit(chars[i])){
        i++;
        continue;
      }
      if(!Character.isLetterOrDigit(chars[j])){
        j--;
        continue;
      }

      chars[i] = Character.toLowerCase(chars[i]);
      chars[j] = Character.toLowerCase(chars[j]);

      if(chars[i]!=chars[j]){
        return false;
      }
      i++;
      j--;
    }
    return true;
  }


  public boolean isPalindromeWithPrecompute(String s) {

    StringBuilder sb = new StringBuilder();
    for(int i=0;i<s.length();i++){
      if(Character.isLetterOrDigit(s.charAt(i))){
        sb.append(s.charAt(i));
      }
    }

    s = sb.toString().toLowerCase();
    int i=0;
    int j=s.length()-1;

    while(i<j){
      if(s.charAt(i)!=s.charAt(j)){
        return false;
      }
      i++;
      j--;
    }
    return true;
  }

}