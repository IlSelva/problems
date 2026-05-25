package com.ilselva.problems.neetcode.neetcode150.arrayshashing.solutions;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecode {
  private static final String START_TAG = "<";
  private static final String END_TAG = ">";

  public String encode(List<String> strs) {

    StringBuilder sb = new StringBuilder();
    for (String str : strs) {
      sb.append(START_TAG);
      sb.append(str.length());
      sb.append(END_TAG);
      sb.append(str);
    }
    return sb.toString();
  }

  public List<String> decode(String str) {

    List<String> result = new ArrayList<>();
    for (int i = 0; i < str.length(); ) {
      int sizeStart = str.indexOf(START_TAG, i);
      int sizeEnd = str.indexOf(END_TAG, sizeStart);
      int len = Integer.parseInt(str.substring(sizeStart + 1, sizeEnd));
      result.add(str.substring(sizeEnd + 1, sizeEnd + 1 + len));
      i = sizeEnd + 1 + len;
    }
    return result;
  }

}