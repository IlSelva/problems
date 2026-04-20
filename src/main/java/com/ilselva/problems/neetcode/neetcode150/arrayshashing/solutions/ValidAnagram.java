package com.ilselva.problems.neetcode.neetcode150.arrayshashing.solutions;

public class ValidAnagram {


  // create array of character occurrences and iterate over the strings s counting each occurrence
  // iterate then over the other string t decrementing each occurrence
  // if any of the occurrences is not 0, return false
  // Time: O(n+m) where n length of s, m length of t
  // Space: O(1)
  public boolean isAnagram(String s, String t) {

    char[] occurrences = new char[26];

    if(s.length() != t.length()){
      return false;
    }

    for(int i = 0; i < s.length(); i++){
      occurrences[s.charAt(i) - 'a']++;
    }

    for(int i = 0; i < t.length(); i++){
      occurrences[t.charAt(i) - 'a']--;
    }

    for (char occurrence : occurrences) {
      if (occurrence != 0) {
        return false;
      }
    }
    return true;
  }

}