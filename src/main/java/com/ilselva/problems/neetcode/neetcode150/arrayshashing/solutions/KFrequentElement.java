package com.ilselva.problems.neetcode.neetcode150.arrayshashing.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class KFrequentElement {

  //bucket sort
  // time: O(n)
  // space: O(k)
  public int[] topKFrequent(int[] nums, int k) {

    Map<Integer, Integer> map = new HashMap<>();
    List<Integer>[] freq = new List[nums.length + 1];

    //init freq
    for(int i=0; i<freq.length; i++){
      freq[i] = new ArrayList<>();
    }

    for(int n : nums){
      map.put(n, map.getOrDefault(n, 0) + 1);
    }

    for(Entry<Integer, Integer> e : map.entrySet()){
      freq[e.getValue()].add(e.getKey());
    }

    int[] result = new int[k];
    int idx = 0;
    for(int i=freq.length-1; i>=0 && idx<k; i--){
      for(int n : freq[i]){
        result[idx++] = n;
        if(idx == k) {
          return result;
        }
      }
    }
    return result;
  }

  // time: O(nlogn)
  // space: O(n)
  public int[] topKFrequent_naive(int[] nums, int k) {

    Map<Integer, Integer> map = new HashMap<>();
    for(int num : nums){
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    int[] result = new int[k];
    int i=0;
    for(Entry<Integer, Integer>e : map.entrySet().stream().sorted((a, b) -> b.getValue() - a.getValue()).toList()){
      result[i++] = e.getKey();
      if(i == k) break;
    }
    return result;
  }

}