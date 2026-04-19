package com.ilselva.problems.leetcode.daily.solutions;

public class MaximumDistanceOfPairs {

  public int maxDistance(int[] nums1, int[] nums2) {
    int i,j;

    for(i=0, j=0; i<nums1.length && j<nums2.length; j++){
      if(nums1[i] > nums2[j]){
        i++;
      }
    }
    return Math.max(0, j-i-1);
  }

  public int maxDistance_first(int[] nums1, int[] nums2) {
    int i=0;
    int maxDistance = 0;

    while(i < nums1.length){
      int j = i;
      while(j < nums2.length && nums1[i]<=nums2[j]){
        maxDistance = Math.max(maxDistance, j-i);
        j++;
      }
      i++;
    }

    return maxDistance;
  }

}