package com.tsakostas.codility.countingelements;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class MissingInteger {

  public int solution(int[] A) {
    Objects.requireNonNull(A);

    if (A.length == 0 || A.length > 100000) {
      return 1;
    }

    Set<Integer> integers = new HashSet<>();
    for (int i = 0; i < A.length; i++) {
      if (A[i] > 0) {
        integers.add(A[i]);
      }
    }

    if (integers.isEmpty()) {
      return 1;
    }

    for (int i = 1; i <= 100000; i++) {
      if (!integers.contains(i)) {
        return i;
      }
    }

    return 100001;
  }
}
