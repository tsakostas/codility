package com.tsakostas.codility.caterpillarmethod;

import static java.lang.Math.abs;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class AbsDistinct {

  public int solution(int[] A) {
    Objects.requireNonNull(A);

    if (A.length == 0 || A.length > 100000) {
      return 0;
    }

    Set<Integer> set = new HashSet<>();

    for (int i = 0; i < A.length; i++) {
      set.add(abs(A[i]));
    }

    return set.size();
  }
}
