package com.tsakostas.codility.timecomplexity;

import java.util.Objects;

public class TapeEquilibrium {

  public int solution(int[] A) {
    Objects.requireNonNull(A);

    int N = A.length;
    if (N < 2 || N > 100000) {
      throw new IllegalArgumentException("Invalid input array length.");
    }

    long leftSum = 0;
    long rightSum = 0;
    long allSum = 0;
    int currentDifference = 0;
    int minimalAbsoluteDifference = (int) Math.pow(2, 16);

    for (int i = 0; i < A.length; i++) {
      allSum += A[i];
    }

    for (int p = 1; p < N; p++) {
      leftSum += A[p - 1];
      rightSum = allSum - leftSum;
      currentDifference = (int) Math.abs(leftSum - rightSum);
      if (minimalAbsoluteDifference > currentDifference) {
        minimalAbsoluteDifference = currentDifference;
      }
    }

    return minimalAbsoluteDifference;
  }

  public int solutionSlow(int[] A) {
    Objects.requireNonNull(A);

    int N = A.length;
    if (N < 2 || N > 100000) {
      throw new IllegalArgumentException("Invalid input array length.");
    }

    int minimalAbsoluteDifference = (int) Math.pow(2, 16);

    for (int p = 1; p < N; p++) {
      int zeroBasedPIndex = p - 1;
      int firstPartSum = 0;
      int secondPartSum = 0;
      for (int i = 0; i < N; i++) {
        if (i <= zeroBasedPIndex) {
          firstPartSum += A[i];
        } else {
          secondPartSum += A[i];
        }
      }
      int currentAbsoluteDifference = Math.abs(firstPartSum - secondPartSum);
      if (minimalAbsoluteDifference > currentAbsoluteDifference) {
        minimalAbsoluteDifference = currentAbsoluteDifference;
      }
    }

    return minimalAbsoluteDifference;
  }
}
