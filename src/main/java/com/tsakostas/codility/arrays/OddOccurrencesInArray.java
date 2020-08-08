package com.tsakostas.codility.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class OddOccurrencesInArray {

  public int solution(int[] A) {
    Objects.requireNonNull(A);

    if (A.length == 0 || A.length > 1000000) {
      return 0;
    }

    Map<Integer, Integer> valueCounterMap = new HashMap<>(A.length);

    for (int i = 0; i < A.length; i++) {
      if (valueCounterMap.containsKey(A[i])) {
        valueCounterMap.put(A[i], valueCounterMap.get(A[i]) + 1);
      } else {
        valueCounterMap.put(A[i], 1);
      }
    }

    for (int i = 0; i < A.length; i++) {
      if (valueCounterMap.get(A[i]) == 1) {
        return A[i];
      }
    }

    return 0;
  }
}
