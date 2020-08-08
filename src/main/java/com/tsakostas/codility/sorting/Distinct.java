package com.tsakostas.codility.sorting;

import java.util.HashSet;
import java.util.Set;

public class Distinct {

  public int solution(int[] A) {

    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < A.length; i++) {
      set.add(A[i]);
    }

    return set.size();
  }
}
