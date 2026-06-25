package com.ilselva.problems.neetcode.neetcode150.arrayshashing.solutions;

import java.util.HashMap;
import java.util.Map;

public class TwoIntegerSumTwo {

  public int[] twoSum(int[] numbers, int target) {
    int s=0;
    int e=numbers.length-1;

    while(s<e){
      int total = numbers[s]+numbers[e];

      if(total==target){
        return new int[]{s+1, e+1};
      }
      if(total>target){
        e--;
      }else{
        s++;
      }
    }
    return new int[]{0, 0};
  }

  public int[] twoSumWithMap(int[] numbers, int target) {
    Map<Integer, Integer> map = new HashMap<>();

    for(int i=0; i<numbers.length; i++){
      map.put(numbers[i], i);
    }

    for(int i=0; i<numbers.length; i++){
      int diff = target - numbers[i];
      if(diff != numbers[i] && map.containsKey(diff)){
        return new int[]{i+1, map.get(diff)+1};
      }
    }

    return new int[]{0, 0};
  }

}