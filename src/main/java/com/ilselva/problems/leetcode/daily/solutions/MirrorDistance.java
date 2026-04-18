package com.ilselva.problems.leetcode.daily.solutions;

public class MirrorDistance {

  public static int getMirrorDistance(int n){
    int mirror = 0;
    int b = n;

    while(n != 0){
      mirror = mirror*10;
      mirror += n%10;
      n = n/10;
    }

    return Math.abs(b - mirror);
  }

}