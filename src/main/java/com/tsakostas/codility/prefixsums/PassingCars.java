package com.tsakostas.codility.prefixsums;

import java.util.Objects;

public class PassingCars {

  public int solution(int[] A) {
    Objects.requireNonNull(A);

    if (A.length > 400000) {
      throw new IllegalArgumentException("Invalid input array length.");
    }

    int maximumSum = 0;
    int currentSum = 0;
    int delta;
    for (int i = 1; i < A.length; i++) {
      delta = A[i] - A[i - 1];
      currentSum = Math.max(delta, currentSum + delta);
      maximumSum = Math.max(currentSum, maximumSum);
    }

    return maximumSum;
  }
}
